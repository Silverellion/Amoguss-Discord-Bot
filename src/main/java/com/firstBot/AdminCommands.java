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
        event.deferReply(true).queue();
        deleteBotMessages(event, event.getChannel().asTextChannel());
    }
    public void deleteAllBotsMessageInThisGuild(SlashCommandInteractionEvent event) {
        event.deferReply(true).queue();
            for (TextChannel channel : Objects.requireNonNull(event.getGuild()).getTextChannels()) {
                deleteBotMessages(event, channel);
            }
    }

    public void deleteAllMessagesInThisChannel(SlashCommandInteractionEvent event) {
        event.deferReply(true).queue();
        if(checkInternalPermission(event, event.getChannel().asTextChannel()))
            deleteAllMessages(event, event.getChannel().asTextChannel());
    }
    public void deleteAllMessagesInThisGuild(SlashCommandInteractionEvent event) {
        event.deferReply(true).queue();
        for (TextChannel channel : Objects.requireNonNull(event.getGuild()).getTextChannels()) {
            if(checkInternalPermission(event, channel))
                deleteAllMessages(event, channel);
        }
    }

    private boolean checkAdmin(SlashCommandInteractionEvent event) {
        if (Objects.requireNonNull(event.getMember()).hasPermission(Permission.MESSAGE_MANAGE)) {
            return true;
        } else {
            event.reply("You don't have permission to use this command, you idiot").setEphemeral(true).queue();
            return false;
        }
    }

    private boolean checkInternalPermission(SlashCommandInteractionEvent event, TextChannel channel) {
        if(channel.getGuild().getSelfMember().hasPermission(channel, Permission.MESSAGE_MANAGE)) {
            return true;
        } else {
            event.reply("I don't have permission in this channel: " + channel.getName()).setEphemeral(true).queue();
            return false;
        }
    }

    private void deleteBotMessages(SlashCommandInteractionEvent event, TextChannel channel) {
        if (checkAdmin(event)) {
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

                    deleteHandler(channel, bulkDeletable, olderMessages);
                }
            });
        }
    }

    private void deleteAllMessages(SlashCommandInteractionEvent event, TextChannel channel) {
        if (checkAdmin(event)) {
            channel.getIterableHistory().takeAsync(100).thenAccept(messages -> {
                List<Message> message = messages.stream().toList();

                if (!message.isEmpty()) {
                    List<Message> bulkDeletable = message.stream()
                            .filter(msg -> msg.getTimeCreated().isAfter(OffsetDateTime.now().minusWeeks(2)))
                            .toList();

                    List<Message> olderMessages = message.stream()
                            .filter(msg -> msg.getTimeCreated().isBefore(OffsetDateTime.now().minusWeeks(2)))
                            .toList();

                    deleteHandler(channel, bulkDeletable, olderMessages);
                }
            });
        }
    }

    private void deleteHandler(TextChannel channel, List<Message> bulkDeletable, List<Message> olderMessages) {
        // Bulk delete recent messages
        if (!bulkDeletable.isEmpty()) {
            channel.deleteMessages(bulkDeletable).queue();
            System.out.println(bulkDeletable);
        }

        // Slowly delete older messages (one by one)
        for (Message curMessage : olderMessages) {
            try {
                curMessage.delete().queue();
                sleep(1500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
