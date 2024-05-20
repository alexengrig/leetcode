package dev.alexengrig.leetcode._104_maximum_depth_of_binary_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    final Solution solution = new Solution();

    @Test
    void test1() {
        TreeNode root = new TreeNode(
                3,
                new TreeNode(9),
                new TreeNode(
                        20,
                        new TreeNode(15),
                        new TreeNode(7)
                )
        );
        assertEquals(3, solution.maxDepth(root));
    }

    @Test
    void test2() {
        TreeNode root = new TreeNode(
                1,
                null,
                new TreeNode(2)
        );
        assertEquals(2, solution.maxDepth(root));
    }

    @Test
    void test3() {
        TreeNode root = null;
        assertEquals(0, solution.maxDepth(root));
    }

    @Test
    void test4() {
        TreeNode root = new TreeNode(0);
        assertEquals(1, solution.maxDepth(root));
    }

}