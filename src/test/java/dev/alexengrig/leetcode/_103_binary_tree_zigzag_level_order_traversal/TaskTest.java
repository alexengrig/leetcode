package dev.alexengrig.leetcode._103_binary_tree_zigzag_level_order_traversal;

import dev.alexengrig.leetcode._103_binary_tree_zigzag_level_order_traversal.Task.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new DequeSolution()),
                Arguments.of(new QueueSolution())
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

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(Task solution) {
        TreeNode root = createBinaryTree(3, 9, 20, null, null, 15, 7);
        assertEquals(List.of(List.of(3), List.of(20, 9), List.of(15, 7)), solution.zigzagLevelOrder(root));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        TreeNode root = createBinaryTree(1);
        assertEquals(List.of(List.of(1)), solution.zigzagLevelOrder(root));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        TreeNode root = createBinaryTree();
        assertEquals(List.of(), solution.zigzagLevelOrder(root));
    }
}