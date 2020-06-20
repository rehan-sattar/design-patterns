package com.company.exercise;

public class Window {
    public void close() {
        beforeClosed();
        System.out.println("Removing the window from the screen");
        afterClosed();
    }

    protected void beforeClosed() {}

    protected void afterClosed() {}
}