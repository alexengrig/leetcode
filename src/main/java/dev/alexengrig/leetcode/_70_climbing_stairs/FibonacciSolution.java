package dev.alexengrig.leetcode._70_climbing_stairs;

class FibonacciSolution implements Task {
    @Override
    public int climbStairs(int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 0;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}
