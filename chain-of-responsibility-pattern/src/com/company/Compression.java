package com.company;

public class Compression extends Handler {

    public Compression(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HTTPRequest request) {
        System.out.println("Compressing...");
        return false;
    }
}
