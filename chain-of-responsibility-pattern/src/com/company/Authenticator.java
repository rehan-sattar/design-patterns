package com.company;

public class Authenticator extends Handler {

    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HTTPRequest request) {
        var isValid = request.getUsername() == "rehan"  && request.getPassword() == "123";
        System.out.println("Authenticating...");
        return !isValid;
    }
}
