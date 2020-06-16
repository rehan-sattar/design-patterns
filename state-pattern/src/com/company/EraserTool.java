package com.company;

public class EraserTool implements Tool {

    @Override
    public void mouseDown() {
        System.out.println("Select eraser icon...");
    }

    @Override
    public void mouseUp() {
        System.out.println("Erasing the parts...");
    }
}
