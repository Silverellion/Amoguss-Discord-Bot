package com.firstBot;

import org.apache.commons.collections4.map.HashedMap;

import java.util.Map;

public class ServerStateManager {
    private static final Map<Long, AdminState> adminState = new HashedMap<>();
    private static final Map<Long, OllamaState> ollamaState = new HashedMap<>();

    private static final AdminState defaultAdminState = new AdminState(
            false
    );

    public static AdminState getAdminState(long guildID) {
        return adminState.getOrDefault(guildID, defaultAdminState);
    }

    public static void setAdminState(long guildId, AdminState newState) {
        adminState.put(guildId, newState);
    }

    public static void setStopDeletion(long guildID, boolean bool) {
        AdminState adminState = getAdminState(guildID);
        adminState.setStopDeletion(bool);
        setAdminState(guildID, adminState);
    }

    //Ollama states

    public static final OllamaState defaultOllamaState = new OllamaState(
            true,
            false,
            false
    );

    public static OllamaState getOllamaState(long guildID) {
        return ollamaState.getOrDefault(guildID, defaultOllamaState);
    }

    public static void setOllamaState(long guildID, OllamaState newState) {
        ollamaState.put(guildID, newState);
    }

    public static void setOllamaChat(long guildID, boolean bool) {
        OllamaState ollamaState = getOllamaState(guildID);
        ollamaState.setChatActive(bool);
        setOllamaState(guildID, ollamaState);
    }

    public static void setRandomOllamaChat(long guildID, boolean bool) {
        OllamaState ollamaState = getOllamaState(guildID);
        ollamaState.setRandomChatActive(bool);
        setOllamaState(guildID, ollamaState);
    }

    public static void setOllamaAutoModeration(long guildID, boolean bool) {
        OllamaState ollamaState = getOllamaState(guildID);
        ollamaState.setAutoModerationActive(bool);
        setOllamaState(guildID, ollamaState);
    }
}
