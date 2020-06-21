package com.company;

public class Chart implements Observer {
    @Override
    public void update() {
        System.out.println("Got the change in the Chart class..");
    }
}
