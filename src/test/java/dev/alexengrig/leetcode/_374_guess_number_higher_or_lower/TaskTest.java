package dev.alexengrig.leetcode._374_guess_number_higher_or_lower;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.function.Supplier;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskTest {
    final static PickHolder PICK = new PickHolder();

    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new Solution() {
                    @Override
                    public int guess(int num) {
                        return Integer.compare(PICK.get(), num);
                    }
                })
        );
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(Task solution) {
        int num = 10;
        PICK.setPick(6);
        assertEquals(6, solution.guessNumber(num));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int num = 1;
        PICK.setPick(1);
        assertEquals(1, solution.guessNumber(num));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        int num = 2;
        PICK.setPick(1);
        assertEquals(1, solution.guessNumber(num));
    }

    static class PickHolder implements Supplier<Integer> {
        private int pick;

        public void setPick(int pick) {
            this.pick = pick;
        }

        @Override
        public Integer get() {
            return pick;
        }

    }
}