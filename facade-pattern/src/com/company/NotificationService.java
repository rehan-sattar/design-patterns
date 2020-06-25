package com.company;

public class NotificationService {

    public void send(String message, String target) {
        NotificationServer server = new NotificationServer();
        Connection connection = server.connect("wewewewewe");
        AuthToken authToken = server.authenticate("Appadawod", "keyandwiua");
        server.send(authToken, new Message(message),  target);
        connection.disconnect();
    }

}
