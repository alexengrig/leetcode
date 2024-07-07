package dev.alexengrig.leetcode._404_sum_of_left_leaves;

import dev.alexengrig.leetcode._404_sum_of_left_leaves.Task.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new RecursiveSolution()),
                Arguments.of(new StackSolution())
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
        assertEquals(24, solution.sumOfLeftLeaves(root));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        TreeNode root = createBinaryTree(1);
        assertEquals(0, solution.sumOfLeftLeaves(root));
    }
}