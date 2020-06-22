package com.company;

public class WebServer {
    private Handler handler;

    public WebServer(Handler handler) {
        this.handler = handler;
    }

    public void handle(HTTPRequest request) {
        handler.handle(request);
    }
}
