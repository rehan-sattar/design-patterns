package com.company;

import com.company.fx.Command;

public class ResizeCommand implements Command {

    @Override
    public void execute() {
        System.out.println("ResizeCommand is running...");
    }
}
