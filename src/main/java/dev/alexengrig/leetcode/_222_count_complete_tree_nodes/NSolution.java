package dev.alexengrig.leetcode._222_count_complete_tree_nodes;

class NSolution implements Task {
    @Override
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
