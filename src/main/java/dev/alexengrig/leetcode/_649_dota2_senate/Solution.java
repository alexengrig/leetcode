package dev.alexengrig.leetcode._649_dota2_senate;

import java.util.ArrayDeque;
import java.util.Queue;

class Solution implements Task {
    @Override
    public String predictPartyVictory(String senate) {
        int n = senate.length();
        Queue<Integer> radiant = new ArrayDeque<>();
        Queue<Integer> dire = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                radiant.offer(i);
            } else {
                dire.offer(i);
            }
        }
        while (!radiant.isEmpty() && !dire.isEmpty()) {
            int radiantIndex = radiant.peek();
            int direIndex = dire.peek();
            if (radiantIndex < direIndex) {
                radiant.offer(radiantIndex + n);
            } else {
                dire.offer(direIndex + n);
            }
            radiant.poll();
            dire.poll();
        }
        return radiant.isEmpty() ? "Dire" : "Radiant";
    }
}
