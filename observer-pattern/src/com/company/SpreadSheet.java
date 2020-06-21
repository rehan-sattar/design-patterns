package com.company;

public class SpreadSheet implements Observer {
    // ...
    @Override
    public void update() {
        System.out.println("Got the change in the spreadSheet..");
    }
}
