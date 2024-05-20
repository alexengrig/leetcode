package dev.alexengrig.leetcode._100_same_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    final Solution solution = new Solution();

    @Test
    void test1() {
        TreeNode left = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode right = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        assertTrue(solution.isSameTree(left, right));
    }

    @Test
    void test2() {
        TreeNode left = new TreeNode(1, new TreeNode(2), null);
        TreeNode right = new TreeNode(1, null, new TreeNode(2));
        assertFalse(solution.isSameTree(left, right));
    }

    @Test
    void test3() {
        TreeNode left = new TreeNode(1, new TreeNode(2), new TreeNode(1));
        TreeNode right = new TreeNode(1, new TreeNode(2), new TreeNode(2));
        assertFalse(solution.isSameTree(left, right));
    }

}