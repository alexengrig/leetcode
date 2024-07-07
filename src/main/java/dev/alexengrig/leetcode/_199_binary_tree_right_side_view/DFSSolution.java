package dev.alexengrig.leetcode._199_binary_tree_right_side_view;

import java.util.ArrayList;
import java.util.List;

class DFSSolution implements Task {
    @Override
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return List.of();
        }
        List<Integer> values = new ArrayList<>();
        rightSideView(root, 0, values);
        return values;
    }

    void rightSideView(TreeNode root, int depth, List<Integer> values) {
        if (depth == values.size()) {
            values.add(root.val);
        }
        if (root.right != null) {
            rightSideView(root.right, depth + 1, values);
        }
        if (root.left != null) {
            rightSideView(root.left, depth + 1, values);
        }
    }
}
