package dev.alexengrig.leetcode._714_best_time_to_buy_and_sell_stock_with_fee;

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
        int[] prices = {1, 3, 2, 8, 4, 9};
        int fee = 2;
        assertEquals(8, solution.maxProfit(prices, fee));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[] prices = {1, 3, 2, 8, 4, 9};
        int fee = 3;
        assertEquals(6, solution.maxProfit(prices, fee));
    }
}