package com.company;

public class Chart implements Observer {
    @Override
    public void update(int value) {
        System.out.println("Got the change in the Chart class.." + value);
    }
}
