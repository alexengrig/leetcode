package dev.alexengrig.leetcode._235_lca_of_bst;

import dev.alexengrig.leetcode._235_lca_of_bst.Task.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new RecursiveSolution()),
                Arguments.of(new LineSolution())
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
        TreeNode root = createBinaryTree(6, 2, 8, 0, 4, 7, 9, null, null, 3, 5);
        TreeNode p = createBinaryTree(2);
        TreeNode q = createBinaryTree(8);
        assertEquals(6, solution.lowestCommonAncestor(root, p, q).val);
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        TreeNode root = createBinaryTree(6, 2, 8, 0, 4, 7, 9, null, null, 3, 5);
        TreeNode p = createBinaryTree(2);
        TreeNode q = createBinaryTree(4);
        assertEquals(2, solution.lowestCommonAncestor(root, p, q).val);
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        TreeNode root = createBinaryTree(2, 1);
        TreeNode p = createBinaryTree(2);
        TreeNode q = createBinaryTree(1);
        assertEquals(2, solution.lowestCommonAncestor(root, p, q).val);
    }
}