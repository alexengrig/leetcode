package dev.alexengrig.leetcode._309_best_time_to_buy_and_sell_stock_with_cooldown;

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
        int[] prices = {1, 2, 3, 0, 2};
        assertEquals(3, solution.maxProfit(prices));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[] prices = {1};
        assertEquals(0, solution.maxProfit(prices));
    }
}