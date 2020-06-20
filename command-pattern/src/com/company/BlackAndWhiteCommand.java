package com.company;

import com.company.fx.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("BlackAndWhiteCommand is running....");
    }
}
