package dev.alexengrig.leetcode._100_same_tree;

import dev.alexengrig.leetcode._100_same_tree.Task.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TaskTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new RecursiveSolution()),
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
        return new Task.TreeNode(
                values[index],
                createBinaryTree(values, index * 2 + 1),
                createBinaryTree(values, index * 2 + 2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(Task solution) {
        TreeNode p = createBinaryTree(1, 2, 3);
        TreeNode q = createBinaryTree(1, 2, 3);
        assertTrue(solution.isSameTree(p, q));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        TreeNode p = createBinaryTree(1, 2);
        TreeNode q = createBinaryTree(1, null, 2);
        assertFalse(solution.isSameTree(p, q));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        TreeNode p = createBinaryTree(1, 2, 1);
        TreeNode q = createBinaryTree(1, 1, 2);
        assertFalse(solution.isSameTree(p, q));
    }
}