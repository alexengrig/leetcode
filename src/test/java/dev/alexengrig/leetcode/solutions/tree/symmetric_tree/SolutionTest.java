package dev.alexengrig.leetcode.solutions.tree.symmetric_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    final Solution solution = new Solution();

    @Test
    void test1() {
        TreeNode root = new TreeNode(
                1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(2, new TreeNode(4), new TreeNode(3)));
        assertTrue(solution.isSymmetric(root));
    }

    @Test
    void test2() {
        TreeNode root = new TreeNode(
                1,
                new TreeNode(2, null, new TreeNode(3)),
                new TreeNode(2, null, new TreeNode(3)));
        assertFalse(solution.isSymmetric(root));
    }

}