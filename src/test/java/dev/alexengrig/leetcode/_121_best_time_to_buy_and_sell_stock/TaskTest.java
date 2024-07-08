package dev.alexengrig.leetcode._121_best_time_to_buy_and_sell_stock;

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

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(Task solution) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        assertEquals(5, solution.maxProfit(prices));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[] prices = {7, 6, 4, 3, 1};
        assertEquals(0, solution.maxProfit(prices));
    }
}