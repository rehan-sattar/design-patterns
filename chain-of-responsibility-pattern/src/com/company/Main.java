package com.company;

public class Main {

    public static void main(String[] args) {
        var compressor = new Compression(null);
        var logger = new Logger(compressor);
        var authenticator = new Authenticator(logger);
        var server = new WebServer(authenticator);

        server.handle(new HTTPRequest("---", "123"));
    }
}
