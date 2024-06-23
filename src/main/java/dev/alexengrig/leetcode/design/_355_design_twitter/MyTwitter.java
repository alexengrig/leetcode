package dev.alexengrig.leetcode.design._355_design_twitter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class MyTwitter implements Twitter {
    private final Map<Integer, Tweet> tweetMap = new HashMap<>();
    private final Map<Integer, Set<Integer>> followerMap = new HashMap<>();

    private int commonCounter;

    public void postTweet(int userId, int tweetId) {
        Tweet tweet = tweetMap.get(userId);
        Tweet newTweet = new Tweet(tweetId, commonCounter++, tweet);
        tweetMap.put(userId, newTweet);
    }

    public List<Integer> getNewsFeed(int userId) {
        Queue<Tweet> heap = new PriorityQueue<>((l, r) -> r.commonId - l.commonId);
        Tweet userTweet = tweetMap.get(userId);
        if (userTweet != null) {
            heap.add(userTweet);
        }
        Set<Integer> followeeIds = followerMap.get(userId);
        if (followeeIds != null && !followeeIds.isEmpty()) {
            for (Integer followeeId : followeeIds) {
                Tweet tweet = tweetMap.get(followeeId);
                if (tweet != null) {
                    heap.add(tweet);
                }
            }
        }
        if (heap.isEmpty()) {
            return List.of();
        }
        List<Integer> result = new ArrayList<>(10);
        for (int i = 0; i < 10 && !heap.isEmpty(); i++) {
            Tweet tweet = heap.remove();
            result.add(tweet.tweetId);
            if (tweet.next != null) {
                heap.add(tweet.next);
            }
        }
        return result;
    }

    public void follow(int followerId, int followeeId) {
        followerMap.computeIfAbsent(followerId, k -> new HashSet<>())
                .add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        Set<Integer> followeeIds = followerMap.get(followerId);
        if (followeeIds != null) {
            followeeIds.remove(followeeId);
        }
    }

    private static class Tweet {
        final int tweetId;
        final int commonId;
        final Tweet next;

        private Tweet(int tweetId, int commonId, Tweet next) {
            this.tweetId = tweetId;
            this.commonId = commonId;
            this.next = next;
        }
    }
}
