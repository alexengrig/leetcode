package dev.alexengrig.leetcode.design._355_design_twitter;

import java.util.List;

interface Twitter {
    void postTweet(int userId, int tweetId);

    List<Integer> getNewsFeed(int userId);

    void follow(int followerId, int followeeId);

    void unfollow(int followerId, int followeeId);
}
