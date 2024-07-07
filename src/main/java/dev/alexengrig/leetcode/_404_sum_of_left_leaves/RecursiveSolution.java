package dev.alexengrig.leetcode._404_sum_of_left_leaves;

class RecursiveSolution implements Task {
    @Override
    public int sumOfLeftLeaves(TreeNode root) {
        return sumOfLeft(root.left) + sumOfRight(root.right);
    }

    int sumOfLeft(TreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            return root.val;
        }
        return sumOfLeft(root.left) + sumOfRight(root.right);
    }

    int sumOfRight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return sumOfLeft(root.left) + sumOfRight(root.right);
    }
}
