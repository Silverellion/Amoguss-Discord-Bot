package com.firstBot;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.channel.ChannelType;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class PrintNewActiveGuildMessages extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if(event.getChannelType()!= ChannelType.TEXT)
            return;
        Message message = event.getMessage();
        String content = message.getContentDisplay();

        String author = message.getAuthor().getName();
        TextChannel channel = event.getChannel().asTextChannel();
        String channelName = channel.getName();
        String serverName = channel.getGuild().getName();

        System.out.print(serverName + ", " + channelName + ": " + author + ": " + content + "\n");

        if(event.getMessage().getAttachments().isEmpty())
            return;
        event.getMessage().getAttachments().forEach(attachment -> {
            if(attachment.isImage()) {
                System.out.println(attachment.getUrl());
            }
        });
    }
}