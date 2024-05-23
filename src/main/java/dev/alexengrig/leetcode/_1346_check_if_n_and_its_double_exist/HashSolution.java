package dev.alexengrig.leetcode._1346_check_if_n_and_its_double_exist;

import java.util.HashSet;
import java.util.Set;

class HashSolution implements Task {
    @Override
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>(2 * (int) (arr.length * .75f));
        for (int value : arr) {
            if (set.contains(value)) {
                return true;
            }
            if (value % 2 == 0)
                set.add(value / 2);
            set.add(value * 2);
        }
        return false;
    }
}
