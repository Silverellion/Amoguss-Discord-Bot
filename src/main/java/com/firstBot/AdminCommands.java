package com.firstBot;

import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static java.lang.Thread.sleep;

public class AdminCommands {
    public void deleteAllBotsMessagesInThisChannel(SlashCommandInteractionEvent event) {
        if (checkAdmin(event)) {
            event.deferReply(true).queue();
            deleteBotMessages(event, event.getChannel().asTextChannel());
            event.getHook().editOriginal("My messages have been removed :(").queue();
        }
    }
    public void deleteAllBotsMessageInThisGuild(SlashCommandInteractionEvent event) {
        if (checkAdmin(event)) {
            event.deferReply(true).queue();
            for (TextChannel channel : Objects.requireNonNull(event.getGuild()).getTextChannels()) {
                deleteBotMessages(event, channel);
            }
            event.getHook().editOriginal("My messages have been removed :(").queue();
        }
    }

    public void deleteAllMessagesInThisChannel(SlashCommandInteractionEvent event) {
        event.deferReply(true).queue();
        if(checkInternalPermission(event.getChannel().asTextChannel())) {
            deleteAllMessages(event, event.getChannel().asTextChannel());
            event.getHook().editOriginal("Everything has been removed").queue();
        }
    }
    public void deleteAllMessagesInThisGuild(SlashCommandInteractionEvent event) {
        event.deferReply(true).queue();
        for (TextChannel channel : Objects.requireNonNull(event.getGuild()).getTextChannels()) {
            if(checkInternalPermission(channel)) {
                deleteAllMessages(event, channel);
                event.getHook().editOriginal("Everything has been deleted").queue();
            }
        }
    }

    private boolean checkAdmin(SlashCommandInteractionEvent event) {
        return Objects.requireNonNull(event.getMember()).hasPermission(Permission.MESSAGE_MANAGE);
    }

    private boolean checkInternalPermission(TextChannel channel) {
        return channel.getGuild().getSelfMember().hasPermission(channel, Permission.MESSAGE_MANAGE);
    }

    private void deleteBotMessages(SlashCommandInteractionEvent event, TextChannel channel) {
        channel.getIterableHistory().takeAsync(100).thenAccept(messages -> {
            List<Message> message = messages.stream()
                    .filter(msg -> msg.getAuthor().getIdLong() == event.getJDA().getSelfUser().getIdLong())
                    .toList();

            if (!message.isEmpty()) {
                List<Message> bulkDeletable = message.stream()
                        .filter(msg -> msg.getTimeCreated().isAfter(OffsetDateTime.now().minusWeeks(2)))
                        .collect(Collectors.toList());

                List<Message> olderMessages = message.stream()
                        .filter(msg -> msg.getTimeCreated().isBefore(OffsetDateTime.now().minusWeeks(2)))
                        .toList();

                deleteHandler(event, channel, bulkDeletable, olderMessages);
            }
        });
    }

    private void deleteAllMessages(SlashCommandInteractionEvent event, TextChannel channel) {
        channel.getIterableHistory().takeAsync(100).thenAccept(messages -> {
            List<Message> message = messages.stream().toList();

            if (!message.isEmpty()) {
                List<Message> bulkDeletable = message.stream()
                        .filter(msg -> msg.getTimeCreated().isAfter(OffsetDateTime.now().minusWeeks(2)))
                        .toList();

                List<Message> olderMessages = message.stream()
                        .filter(msg -> msg.getTimeCreated().isBefore(OffsetDateTime.now().minusWeeks(2)))
                        .toList();

                deleteHandler(event, channel, bulkDeletable, olderMessages);
            }
        });
    }

    private void deleteHandler(SlashCommandInteractionEvent event, TextChannel channel, List<Message> bulkDeletable, List<Message> olderMessages) {
        ServerStateManager.setStopDeletion(IDGetterHelper.getGuildIDLongFromSlashCommandInteractionEvent(event), false);
        // Bulk delete recent messages
        if (!bulkDeletable.isEmpty()) {
            channel.deleteMessages(bulkDeletable).queue();
            System.out.println(bulkDeletable);
        }

        // Slowly delete older messages (one by one)
        for (Message curMessage : olderMessages) {
            if(ServerStateManager.getAdminState(IDGetterHelper.getGuildIDLongFromSlashCommandInteractionEvent(event)).getStopDeletion()) {
                break;
            }
            try {
                curMessage.delete().queue();
                sleep(2500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void stopDelete(SlashCommandInteractionEvent event) {
        if(ServerStateManager.getAdminState(IDGetterHelper.getGuildIDLongFromSlashCommandInteractionEvent(event)).getStopDeletion()) {
            return;
        }
        ServerStateManager.setStopDeletion(IDGetterHelper.getGuildIDLongFromSlashCommandInteractionEvent(event), true);
        event.getHook().editOriginal("Message deletion has been stopped!").queue();
    }
}
