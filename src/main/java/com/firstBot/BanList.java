package com.firstBot;

import java.util.ArrayList;

public class BanList {
    private static final ArrayList<Long> bannedUsers = new ArrayList<>();
    private static final ArrayList<Long> bannedServers = new ArrayList<>();

    public static void addBannedUser(long UID) {
        bannedUsers.add(UID);
    }

    public static void addBannedServer(long SID) {
        bannedServers.add(SID);
    }

    public static Boolean isUserBanned(long UID) {
        return bannedUsers.contains(UID);
    }

    public static Boolean isServerBanned(long SID) {
        return bannedServers.contains(SID);
    }

    public static ArrayList<Long> getBannedUsers() {
        return bannedUsers;
    }

    public static ArrayList<Long> getBannedServers() {
        return bannedServers;
    }
}
