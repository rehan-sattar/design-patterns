package com.company.exercise;

import com.company.exercise.Gmail.GmailClient;

public class GmailAdapter implements EmailProvider {
    private final GmailClient gmailClient = new GmailClient();

    @Override
    public void downloadEmails() {
        gmailClient.connect();
        gmailClient.getEmails();
        gmailClient.disconnect();
    }
}
