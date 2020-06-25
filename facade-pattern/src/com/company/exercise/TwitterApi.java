package com.company.exercise;

import java.util.List;

public class TwitterApi {
    private final String appKey;
    private final  String secret;

    public TwitterApi(String appKey, String secret) {
        this.appKey = appKey;
        this.secret = secret;
    }

    public List<Tweet> getRecentTweets() {
        TwitterClient twitterClient = new TwitterClient();
        return  twitterClient.getRecentTweets(getAccessToken());
    }

    String getAccessToken() {
        OAuth oauth = new OAuth();
        String requestToken = oauth.requestToken("appKey", "secret");
        return oauth.getAccessToken(requestToken);
    }

}
