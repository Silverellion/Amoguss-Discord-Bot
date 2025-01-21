package com.firstBot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.events.session.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class RandomAuthorizedOllamaChat extends ListenerAdapter {
    private final RandomOllamaChat authorizedChat = new RandomOllamaChat();
    @Override
    public void onReady(ReadyEvent event) {
        JDA jda = event.getJDA();
        Guild authorizedGuild = jda.getGuildById(1313809054375608340L);
        TextChannel authorizedChannel = jda.getTextChannelById(1313809054375608343L);
        authorizedChat.startReadingMessages(authorizedGuild, authorizedChannel, 5, jda, 30000);
    }
}
