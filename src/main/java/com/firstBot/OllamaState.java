package com.firstBot;

public class OllamaState {
    public static boolean chat = true;
    public static boolean randomChat = false;
    public static boolean autoModeration = false;

    public static void setChatActive(boolean active) {
        chat = active;
    }
    public static boolean isChatActive() {
        return chat;
    }

    public static void setRandomChatActive(boolean active) {
        randomChat = active;
    }
    public static boolean isRandomChatActive() {
        return randomChat;
    }

    public static void setAutoModerationActive(boolean active) {
        autoModeration = active;
    }
    public static boolean isAutoModerationActive() {
        return autoModeration;
    }

}
