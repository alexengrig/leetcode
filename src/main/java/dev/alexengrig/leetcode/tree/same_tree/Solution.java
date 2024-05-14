package dev.alexengrig.leetcode.tree.same_tree;

import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null) {
            return q == null;
        } else if (q == null) {
            return false;
        }
        TreeNode node1 = p;
        TreeNode node2 = q;
        Deque<TreeNode> nodes = new LinkedList<>();
        while (node1 != null && node2 != null) {
            if (node1.val != node2.val) {
                return false;
            } else if (node1.left == null ^ node2.left == null) {
                return false;
            } else if (node1.right == null ^ node2.right == null) {
                return false;
            } else if (node1.left != null && node1.right != null) {
                nodes.push(node1.right);
                node1 = node1.left;
                nodes.push(node2.right);
                node2 = node2.left;
            } else if (node1.left != null) {
                node1 = node1.left;
                node2 = node2.left;
            } else if (node1.right != null) {
                node1 = node1.right;
                node2 = node2.right;
            } else {
                node2 = nodes.poll();
                node1 = nodes.poll();
            }
        }
        return true;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
