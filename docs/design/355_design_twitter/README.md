# [355. Design Twitter](https://leetcode.com/problems/design-twitter/)

## [Solution code](https://github.com/alexengrig/leetcode/blob/main/src/main/java/dev/alexengrig/leetcode/design/_355_design_twitter/MyTwitter.java)

### postTweet

**Time complexity: O(1)**

**Space complexity: O(|tweets|)**

### getNewsFeed

_users = one and one's followees_

_u = |users|_

_tweets = users' tweets_

_t = min(|tweets|, 10)_

**Time complexity: O(u*log(u) + t*log(u))**

**Space complexity: O(u)**

### follow

**Time complexity: O(1)**

**Space complexity: O(|followers| + |followees|)**

### unfollow

**Time complexity: O(1)**

**Space complexity: O(|followers| + |followees|)**

```
Runtime 10 ms
Beats 30.72%

Memory 41.46 MB
Beats 55.91%
```
