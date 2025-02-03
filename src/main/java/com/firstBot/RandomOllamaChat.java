package com.firstBot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.events.session.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.restaction.pagination.MessagePaginationAction;

import java.util.*;

public class RandomOllamaChat extends ListenerAdapter {

    @Override
    public void onReady(ReadyEvent event) {
        JDA jda = event.getJDA();
            for(Guild guild : jda.getGuilds()) {
                if(ServerStateManager.getOllamaState(guild.getIdLong()).isRandomChatActive())
                    startReadingMessages(guild, 5, jda, 300000); // Runs every 5 minutes (300,000 ms)
            }
    }

    public void startReadingMessages(Guild guild, int numberOfLines, JDA jda, int milliSecond) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                startSettings(guild, numberOfLines, jda);
            }
        }, 0, milliSecond);
    }

    public void startReadingMessages(Guild guild, TextChannel channel, int numberOfLines, JDA jda, int milliSecond) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                startSettings(guild, channel, numberOfLines, jda);
            }
        }, 0, milliSecond);
    }

    private void startSettings(Guild guild, int numberOfLines, JDA jda) {
        List<TextChannel> textChannels = guild.getTextChannels();
        TextChannel randomChannel = textChannels.get(new Random().nextInt(textChannels.size()));
        if ((randomChannel.getPermissionOverride(guild.getPublicRole()) == null ||
                Objects.requireNonNull(randomChannel.getPermissionOverride(guild.getPublicRole())).getAllowed().contains(Permission.VIEW_CHANNEL)) &&
                randomChannel.canTalk())
            readRandomMessages(randomChannel, numberOfLines, jda);
    }

    private void startSettings(Guild guild, TextChannel channel, int numberOfLines, JDA jda) {
        if ((channel.getPermissionOverride(guild.getPublicRole()) == null ||
                Objects.requireNonNull(channel.getPermissionOverride(guild.getPublicRole())).getAllowed().contains(Permission.VIEW_CHANNEL)) &&
                channel.canTalk())
            readRandomMessages(channel, numberOfLines, jda);
    }

    private void readRandomMessages(TextChannel channel, int numberOfLines, JDA jda) {
        List<Message> messages = new ArrayList<>();

        MessagePaginationAction history = channel.getIterableHistory();
        int fetched = 0;
        for (Message message : history) {
            messages.add(message);
            if (++fetched >= numberOfLines)
                break;
        }

        StringBuilder tempString = new StringBuilder();
        for(Message currentMessage : messages) {
            if(currentMessage.getAuthor().getIdLong() != jda.getSelfUser().getIdLong()) {
                tempString.append(currentMessage.getContentRaw());
                tempString.append("\n");
            }
        }
        if(tempString.isEmpty())
            return;
        OllamaReader ollamaReader = new OllamaReader();
        channel.sendMessage(ollamaReader.getResponse(channel.getIdLong(), tempString.toString())).queue();
    }
}
