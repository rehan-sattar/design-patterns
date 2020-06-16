package com.company.exsercise;

public class WalkingMode implements CurrentMode {
    @Override
    public int getEta() {
        System.out.println("Calculating ETA (walking)");
        return 0;
    }

    @Override
    public int getDirection() {
        System.out.println("Calculating Direction (walking)");
        return 0;
    }
}
