package dev.alexengrig.leetcode._100_same_tree;

class RecursiveSolution implements Task {
    @Override
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            return p == q;
        }
        return p.val == q.val
               && isSameTree(p.left, q.left)
               && isSameTree(p.right, q.right);
    }
}
