package com.firstBot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.events.session.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.ArrayList;
import java.util.List;

public class PrintGuildPastMessages extends ListenerAdapter {

    @Override
    public void onReady(ReadyEvent event) {
        JDA jda = event.getJDA();
        for (Guild guild : jda.getGuilds()) {
            if(guild.getId().equals("1130853683576447097")) {
                for (TextChannel channel : guild.getTextChannels()) {
                    fetchMessages(channel);
                }
            }
        }
    }

    private void fetchMessages(TextChannel channel) {
        if (channel == null) {
            return;
        }
        List<Message> messages = fetchAllMessages(channel, 100);
        messages.forEach(message -> {
            System.out.println(
                    channel.getName()
                    + ": "
                    + message.getAuthor().getName()
                    + ": "
                    + message.getContentDisplay()
//                    + " ("
//                    + message.getTimeCreated().toLocalTime().toString()
//                    + ")"
            );
        });
    }

    private List<Message> fetchAllMessages(TextChannel channel, int numberOfLines) {

        List<Message> messages = new ArrayList<>();
        Message lastMessage = null;
        boolean done = false;

        while (!done) {
            List<Message> tempMessages;
            if (lastMessage == null) {
                tempMessages = channel.getHistory().retrievePast(numberOfLines).complete();
            } else {
                tempMessages = channel.getHistoryBefore(lastMessage.getId(), numberOfLines)
                        .complete()
                        .getRetrievedHistory();
            }

            messages.addAll(tempMessages);

            if (tempMessages.size() < numberOfLines) {
                done = true;
            } else {
                lastMessage = tempMessages.getLast();
            }
        }
        return messages;
    }
}