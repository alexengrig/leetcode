package dev.alexengrig.leetcode._278_first_bad_version;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.function.Predicate;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskTest {
    static final BadVersionPredicate BAD_VERSION_CHECKER = new BadVersionPredicate();

    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new Solution() {
                    @Override
                    public boolean isBadVersion(int n) {
                        return BAD_VERSION_CHECKER.test(n);
                    }
                })
        );
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(Task solution) {
        int n = 5, bad = 4;
        BAD_VERSION_CHECKER.setExpected(bad);
        assertEquals(4, solution.firstBadVersion(n));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int n = 1, bad = 1;
        BAD_VERSION_CHECKER.setExpected(bad);
        assertEquals(1, solution.firstBadVersion(n));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        int n = 2126753390, bad = 1702766719;
        BAD_VERSION_CHECKER.setExpected(bad);
        assertEquals(1702766719, solution.firstBadVersion(n));
    }

    static class BadVersionPredicate implements Predicate<Integer> {
        private int expected;

        public void setExpected(int expected) {
            this.expected = expected;
        }

        @Override
        public boolean test(Integer integer) {
            return expected <= integer;
        }
    }
}