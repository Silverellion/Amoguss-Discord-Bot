package com.firstBot;

public class AdminState {
    public boolean stopDeletion;

    public AdminState(boolean stopDeletion) {
        setStopDeletion(stopDeletion);
    }

    public void setStopDeletion(boolean stopDeletion) {
        this.stopDeletion = stopDeletion;
    }
    public Boolean getStopDeletion() {
        return stopDeletion;
    }
}
