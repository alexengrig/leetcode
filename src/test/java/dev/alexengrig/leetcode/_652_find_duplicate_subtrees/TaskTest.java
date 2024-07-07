package dev.alexengrig.leetcode._652_find_duplicate_subtrees;

import dev.alexengrig.leetcode._652_find_duplicate_subtrees.Task.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new Solution())
        );
    }

    static TreeNode createBinaryTree(Integer... values) {
        return createBinaryTree(values, 0);
    }

    static TreeNode createBinaryTree(Integer[] values, int index) {
        if (values.length <= index || values[index] == null) {
            return null;
        }
        return new TreeNode(
                values[index],
                createBinaryTree(values, index * 2 + 1),
                createBinaryTree(values, index * 2 + 2)
        );
    }

    static void assertBinaryTreeEquals(TreeNode expected, TreeNode actual) {
        if (expected == null || actual == null) {
            assertEquals(expected, actual);
        } else {
            assertEquals(expected.val, actual.val);
            assertBinaryTreeEquals(expected.left, actual.left);
            assertBinaryTreeEquals(expected.right, actual.right);
        }
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(Task solution) {
        // original input: 1, 2, 3, 4, null, 2, 4, null, null, 4
        TreeNode root = createBinaryTree(1, 2, 3, 4, null, 2, 4, null, null, null, null, 4);
        List<TreeNode> actual = solution.findDuplicateSubtrees(root);
        List<TreeNode> expected = List.of(createBinaryTree(4), createBinaryTree(2, 4));
        assertEquals(expected.size(), actual.size());
        for (int i = 0; i < expected.size(); i++) {
            assertBinaryTreeEquals(expected.get(i), actual.get(i));
        }
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        TreeNode root = createBinaryTree(2, 1, 1);
        List<TreeNode> actual = solution.findDuplicateSubtrees(root);
        List<TreeNode> expected = List.of(createBinaryTree(1));
        assertEquals(expected.size(), actual.size());
        for (int i = 0; i < expected.size(); i++) {
            assertBinaryTreeEquals(expected.get(i), actual.get(i));
        }
    }
}