package dev.alexengrig.leetcode._1431_kids_with_greatest_candies;

import java.util.ArrayList;
import java.util.List;

class Solution implements Task {
    @Override
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int candy : candies) {
            max = Math.max(max, candy);
        }
        List<Boolean> results = new ArrayList<>(candies.length);
        for (int candy : candies) {
            results.add(candy + extraCandies >= max);
        }
        return results;
    }
}
