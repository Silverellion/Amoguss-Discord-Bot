package com.firstBot;

public class OllamaState {
    public boolean chat;
    public boolean randomChat;
    public boolean autoModeration;

    public OllamaState(boolean llamaChat, boolean randomLlamaChat, boolean autoModeration) {
        setChatActive(llamaChat);
        setRandomChatActive(randomLlamaChat);
        setAutoModerationActive(autoModeration);
    }

    public void setChatActive(boolean active) {
        chat = active;
    }
    public boolean isChatActive() {
        return chat;
    }

    public void setRandomChatActive(boolean active) {
        randomChat = active;
    }
    public boolean isRandomChatActive() {
        return randomChat;
    }

    public void setAutoModerationActive(boolean active) {
        autoModeration = active;
    }
    public boolean isAutoModerationActive() {
        return autoModeration;
    }
}
