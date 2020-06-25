package com.company;

import com.company.exercise.TwitterApi;

public class Main {

    public static void main(String[] args) {
	    NotificationService notificationService = new NotificationService();
	    notificationService.send("Hello world", "user");

        TwitterApi twitterApi = new TwitterApi("some key", "secret");
        twitterApi.getRecentTweets();
    }
}
