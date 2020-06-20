package com.company.exercise;

public class ToolbarWindow extends Window {

    @Override
    protected void beforeClosed() {
        System.out.println("Performing some task before window is closed.");
    }

    @Override
    protected void afterClosed() {
        System.out.println("Performing some task after window is closed.");
    }
}
