package dev.alexengrig.leetcode._108_convert_sorted_array_to_binary_search_tree;

import dev.alexengrig.leetcode._108_convert_sorted_array_to_binary_search_tree.Task.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

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
        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode expected = createBinaryTree(0, -3, 9, -10, null, 5);
        TreeNode actual = solution.sortedArrayToBST(nums);
        assertBinaryTreeEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[] nums = {1, 3};
        TreeNode expected = createBinaryTree(3, 1);
        TreeNode actual = solution.sortedArrayToBST(nums);
        assertBinaryTreeEquals(expected, actual);
    }
}