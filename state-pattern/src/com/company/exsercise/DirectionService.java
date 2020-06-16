package com.company.exsercise;

public class DirectionService {
    private CurrentMode currentCurrentMode = new WalkingMode();

    public void getEta() {
        currentCurrentMode.getEta();
    }

    public void getDirection() {
        currentCurrentMode.getDirection();
    }

    public CurrentMode getCurrentCurrentMode() {
        return currentCurrentMode;
    }

    public void setCurrentCurrentMode(CurrentMode currentCurrentMode) {
        this.currentCurrentMode = currentCurrentMode;
    }
}