package dev.alexengrig.leetcode._222_count_complete_tree_nodes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new LogN2Solution()),
                Arguments.of(new NSolution())
        );
    }

    static Task.TreeNode createBinaryTree(Integer... values) {
        return createBinaryTree(values, 0);
    }

    static Task.TreeNode createBinaryTree(Integer[] values, int index) {
        if (values.length <= index || values[index] == null) {
            return null;
        }
        return new Task.TreeNode(
                values[index],
                createBinaryTree(values, index * 2 + 1),
                createBinaryTree(values, index * 2 + 2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(Task solution) {
        Task.TreeNode root = createBinaryTree(1, 2, 3, 4, 5, 6);
        assertEquals(6, solution.countNodes(root));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        Task.TreeNode root = createBinaryTree();
        assertEquals(0, solution.countNodes(root));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        Task.TreeNode root = createBinaryTree(1);
        assertEquals(1, solution.countNodes(root));
    }
}