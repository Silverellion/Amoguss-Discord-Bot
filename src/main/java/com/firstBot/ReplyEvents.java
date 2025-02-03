package com.firstBot;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.List;

public class ReplyEvents extends ListenerAdapter {
    OllamaReader ollamaReader = InitializeOllama.ollamaReader;

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        long userID = event.getAuthor().getIdLong();
        long selfID = event.getJDA().getSelfUser().getIdLong();
        long serverID = event.getGuild().getIdLong();

        if(!ServerStateManager.getOllamaState(IDGetterHelper.getGuildIDLongFromMessageReceivedEvent(event)).isChatActive())
            return;
        if (BanList.isUserBanned(userID) || BanList.isServerBanned(serverID))
            return;

        Message referencedMessage = event.getMessage().getReferencedMessage();
        String botMention = event.getGuild().getSelfMember().getAsMention();
        String originalMessage = event.getMessage().getContentRaw();
        String trimmedMessage = event.getMessage().getContentRaw().replace(botMention, "").trim();

//        System.out.println("Original Message: " + originalMessage);
//        System.out.println("Trimmed Message: " + trimmedMessage);

        String content = "";

        // If the bot is being mentioned
        if (originalMessage.contains(botMention)) {
            if (referencedMessage != null && referencedMessage.getAuthor().getIdLong() != selfID) {
                content = referencedMessage.getContentDisplay() + "\n" + trimmedMessage;
            } else {
                content = trimmedMessage;
            }
        }
        // If the bot is being replied to
        else if (referencedMessage != null && referencedMessage.getAuthor().getIdLong() == selfID) {
            content = referencedMessage.getContentDisplay() + "\n" + event.getMessage().getContentDisplay();
        }

        if (!content.isEmpty()) {
            StringBuilder outcomeMessage = new StringBuilder(ollamaRespond(userID, content));
            List<User> mentionedUsers = event.getMessage().getMentions().getUsers();
            for (User user : mentionedUsers) {
                if (user.getIdLong() != selfID && user.isBot()) {
                    outcomeMessage.append(" ").append(user.getAsMention());
                }
            }
            event.getMessage().reply(outcomeMessage.toString()).queue();
        }
    }

    private String ollamaRespond(long UID, String content) {
        return ollamaReader.getResponse(UID, content);
    }
}