package dev.alexengrig.leetcode._235_lca_of_bst;

public class LineSolution implements Task {
    @Override
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int max = Math.max(p.val, q.val), min = Math.min(p.val, q.val);
        TreeNode node = root;
        while (node != null) {
            if (node.val > max) {
                node = node.left;
            } else if (node.val < min) {
                node = node.right;
            } else {
                return node;
            }
        }
        throw new IllegalArgumentException();
    }
}
