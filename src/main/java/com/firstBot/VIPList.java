package com.firstBot;

import java.util.ArrayList;

public class VIPList {
    private final ArrayList<String> VIPList;
    public VIPList() {
        this.VIPList = new ArrayList<>();
    }
    public void initialize() {
        VIPList.add("589917839461449728");
    }
    public Boolean containsUID(String specialUID) {
        return VIPList.contains(specialUID);
    }
}
