package com.firstBot;

import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class OllamaAutoModeration extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if(!event.getGuild().getSelfMember().hasPermission(Permission.MESSAGE_MANAGE))
            return;
        if(event.getAuthor().getIdLong() == event.getJDA().getSelfUser().getIdLong())
            return;
        if(!OllamaState.isAutoModerationActive())
            return;

        OllamaReader ollamaReader = new OllamaReader(0.8, 50);
        String contentCheck = "Does this message contain racial slurs?\n" + event.getMessage().getContentDisplay() + "\nAnswer Yes or No only.";
        String ollamaResponse = ollamaReader.getResponse(event.getAuthor().getIdLong(), contentCheck);
        if(ollamaResponse.toLowerCase().contains("yes")) {
            event.getMessage().delete().queue();
        }
    }
}
