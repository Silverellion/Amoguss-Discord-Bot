package com.firstBot;

import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;

import java.util.List;
import java.util.Objects;

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
        if(checkAdmin(event)) {
            while (true) {
                List<Message> botMessages = channel.getHistory()
                        .retrievePast(10)
                        .complete()
                        .stream()
                        .filter(message -> message.getAuthor().getIdLong() == event.getJDA().getSelfUser().getIdLong())
                        .toList();
                if (botMessages.isEmpty())
                    break;
                channel.purgeMessages(botMessages);
            }
        }
    }

    private void deleteAllMessages(SlashCommandInteractionEvent event, TextChannel channel) {
        if (checkAdmin(event)) {
            while (true) {
                List<Message> messages = channel.getHistory()
                        .retrievePast(10)
                        .complete();
                if (messages.isEmpty())
                    break;
                channel.purgeMessages(messages);
            }
        }
    }
}
