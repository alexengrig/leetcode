package dev.alexengrig.leetcode.design._2241_design_atm_machine;

public class MyATM implements ATM {
    private final int[] banknotes = {20, 50, 100, 200, 500};
    private final int[] counts = new int[banknotes.length];

    public void deposit(int[] banknotesCount) {
        for (int i = 0, n = banknotes.length; i < n; i++) {
            counts[i] += banknotesCount[i];
        }
    }

    public int[] withdraw(int amount) {
        int[] results = new int[banknotes.length];
        for (int i = banknotes.length - 1; i >= 0; i--) {
            results[i] = Math.min(counts[i], amount / banknotes[i]);
            amount -= results[i] * banknotes[i];
        }
        if (amount > 0) {
            return new int[]{-1};
        }
        for (int i = 0, n = banknotes.length; i < n; i++) {
            counts[i] -= results[i];
        }
        return results;
    }
}
