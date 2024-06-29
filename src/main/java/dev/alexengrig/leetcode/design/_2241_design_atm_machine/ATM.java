package dev.alexengrig.leetcode.design._2241_design_atm_machine;

interface ATM {
    void deposit(int[] banknotesCount);

    int[] withdraw(int amount);
}
