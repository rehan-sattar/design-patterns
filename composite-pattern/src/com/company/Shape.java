package com.company;

public class Shape implements Component {
    @Override
    public void render() {
        System.out.println("Rendering...");
    }

    @Override
    public void move() {
        System.out.println("Moving...");
    }
}
