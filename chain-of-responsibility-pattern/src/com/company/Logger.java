package com.company;

public class Logger extends Handler {
    public Logger(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HTTPRequest request) {
        System.out.println("Logging...");
        return false;
    }
}
