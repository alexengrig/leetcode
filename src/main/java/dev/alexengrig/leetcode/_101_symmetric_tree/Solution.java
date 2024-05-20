package dev.alexengrig.leetcode._101_symmetric_tree;

import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        } else if (root.left == null && root.right == null) {
            return true;
        } else if (root.left == null || root.right == null) {
            return false;
        }
        TreeNode node1 = root.left;
        TreeNode node2 = root.right;
        Deque<TreeNode> nodes = new LinkedList<>();
        while (node1 != null && node2 != null) {
            if (node1.val != node2.val) {
                return false;
            } else if (node1.left == null ^ node2.right == null) {
                return false;
            } else if (node1.right == null ^ node2.left == null) {
                return false;
            } else if (node1.left != null && node1.right != null) {
                nodes.push(node1.right);
                node1 = node1.left;
                nodes.push(node2.left);
                node2 = node2.right;
            } else if (node1.left != null) {
                node1 = node1.left;
                node2 = node2.right;
            } else if (node1.right != null) {
                node1 = node1.right;
                node2 = node2.left;
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
