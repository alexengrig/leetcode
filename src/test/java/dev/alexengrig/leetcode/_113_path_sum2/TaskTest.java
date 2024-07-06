package dev.alexengrig.leetcode._113_path_sum2;

import dev.alexengrig.leetcode._113_path_sum2.Task.TreeNode;
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

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(Task solution) {
        // original input: 5,4,8,11,null,13,4,7,2,null,null,5,1
        TreeNode root = createBinaryTree(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, null, 5, 1);
        int targetSum = 22;
        assertEquals(List.of(List.of(5, 4, 11, 2), List.of(5, 8, 4, 5)), solution.pathSum(root, targetSum));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        TreeNode root = createBinaryTree(1, 2, 3);
        int targetSum = 5;
        assertEquals(List.of(), solution.pathSum(root, targetSum));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        TreeNode root = createBinaryTree(1, 2);
        int targetSum = 0;
        assertEquals(List.of(), solution.pathSum(root, targetSum));
    }
}