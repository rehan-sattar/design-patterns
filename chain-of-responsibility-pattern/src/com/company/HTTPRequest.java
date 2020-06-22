package com.company;

public class HTTPRequest {
    private final String username;
    private final String password;


    public HTTPRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
