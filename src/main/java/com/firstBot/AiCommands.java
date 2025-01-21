package com.firstBot;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;

public class AiCommands {

    public static void startChat(SlashCommandInteractionEvent event) {
        OllamaState.setChatActive(true);
        event.reply("AI chat has been enabled!")
                .setEphemeral(true)
                .queue();
    }

    public static void stopChat(SlashCommandInteractionEvent event) {
        OllamaState.setChatActive(false);
        event.reply("AI chat has been disabled!")
                .setEphemeral(true)
                .queue();
    }

    public static void startRandomMessages(SlashCommandInteractionEvent event) {
        OllamaState.setRandomChatActive(true);
        event.reply("Random AI messages have been enabled!, if the bot doesn't send any messages, try to use /startchat")
                .setEphemeral(true)
                .queue();
    }

    public static void stopRandomMessages(SlashCommandInteractionEvent event) {
        OllamaState.setRandomChatActive(false);
        event.reply("Random AI chat have been enabled!")
                .setEphemeral(true)
                .queue();
    }

    public static void startAutoModeration(SlashCommandInteractionEvent event) {
        OllamaState.setAutoModerationActive(true);
        event.reply("Auto Moderation has been enabled!")
                .setEphemeral(true)
                .queue();
    }

    public static void stopAutoModeration(SlashCommandInteractionEvent event) {
        OllamaState.setAutoModerationActive(false);
        event.reply("Auto Moderation has been disabled!")
                .setEphemeral(true)
                .queue();
    }

    public static void clearMemory(SlashCommandInteractionEvent event) {
        InitializeOllama.ollamaReader.clearMemory(event.getUser().getIdLong());
        event.reply("Memory has been cleared!")
                .setEphemeral(true)
                .queue();
    }
}
