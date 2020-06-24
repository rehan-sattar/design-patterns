package com.company;

import com.company.araFilters.Caramel;
import com.company.exercise.EmailClient;
import com.company.exercise.Gmail.GmailClient;
import com.company.exercise.GmailAdapter;

public class Main {

    public static void main(String[] args) {
        Image image = new Image();
	    ImageView view = new ImageView(image);
	    view.apply(new CaramelFilter(new Caramel()));

       // Exercise code..
        EmailClient emailClient = new EmailClient();
        emailClient.addProvider(new GmailAdapter());
        emailClient.downloadEmails();

    }
}
