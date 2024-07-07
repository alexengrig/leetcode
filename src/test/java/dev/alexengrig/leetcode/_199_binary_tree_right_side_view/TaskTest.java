package dev.alexengrig.leetcode._199_binary_tree_right_side_view;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new BFSSolution()),
                Arguments.of(new DFSSolution())
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
        Task.TreeNode root = createBinaryTree(1, 2, 3, null, 5, null, 4);
        assertEquals(List.of(1, 3, 4), solution.rightSideView(root));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        Task.TreeNode root = createBinaryTree(1, null, 3);
        assertEquals(List.of(1, 3), solution.rightSideView(root));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        Task.TreeNode root = createBinaryTree();
        assertEquals(List.of(), solution.rightSideView(root));
    }
}