package com.firstBot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.events.session.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class RandomAuthorizedOllamaChat extends ListenerAdapter {
    private final RandomOllamaChat authorizedChat = new RandomOllamaChat();
    @Override
    public void onReady(ReadyEvent event) {
        JDA jda = event.getJDA();
        authorizedChat.startReadingAuthorizedMessages(jda.getTextChannelById(DiscordTokens.secretChannel), 5, jda, 30000);
    }
}
