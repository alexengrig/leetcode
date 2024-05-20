package dev.alexengrig.leetcode._104_maximum_depth_of_binary_tree;

import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            return 1;
        }
        TreeNode node = root;
        Deque<DeepTreeNode> nodes = new LinkedList<>();
        int max = 1;
        int curr = 1;
        while (node != null) {
            if (node.left != null && node.right != null) {
                nodes.push(new DeepTreeNode(curr + 1, node.right));
                node = node.left;
                curr++;
            } else if (node.left != null) {
                node = node.left;
                curr++;
            } else if (node.right != null) {
                node = node.right;
                curr++;
            } else {
                if (curr > max) {
                    max = curr;
                }
                DeepTreeNode deepNode = nodes.poll();
                if (deepNode != null) {
                    curr = deepNode.depth;
                    node = deepNode.node;
                } else {
                    node = null;
                }
            }
        }
        return max;
    }
}

class DeepTreeNode {
    int depth;
    TreeNode node;

    DeepTreeNode(int depth, TreeNode node) {
        this.depth = depth;
        this.node = node;
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
