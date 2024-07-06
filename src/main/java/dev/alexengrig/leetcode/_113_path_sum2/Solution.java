package dev.alexengrig.leetcode._113_path_sum2;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class Solution implements Task {
    @Override
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> results = new ArrayList<>();
        dfs(root, targetSum, new LinkedList<>(), results);
        return results;
    }

    void dfs(TreeNode root, int targetSum, Deque<Integer> paths, List<List<Integer>> results) {
        if (root == null) {
            return;
        }
        paths.addLast(root.val);
        if (root.val == targetSum && root.left == null && root.right == null) {
            results.add(List.copyOf(paths));
        } else {
            int newSum = targetSum - root.val;
            dfs(root.left, newSum, paths, results);
            dfs(root.right, newSum, paths, results);
        }
        paths.removeLast();
    }
}
