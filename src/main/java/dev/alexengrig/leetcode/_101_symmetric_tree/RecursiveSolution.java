package dev.alexengrig.leetcode._101_symmetric_tree;

class RecursiveSolution implements Task {
    @Override
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root.left, root.right);
    }

    boolean isSymmetric(TreeNode node1, TreeNode node2) {
        if (node1 == null || node2 == null) {
            return node1 == node2;
        }
        return node1.val == node2.val
               && isSymmetric(node1.left, node2.right)
               && isSymmetric(node1.right, node2.left);
    }
}
