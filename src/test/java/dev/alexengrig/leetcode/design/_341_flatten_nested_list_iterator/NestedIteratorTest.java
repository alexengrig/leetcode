package dev.alexengrig.leetcode.design._341_flatten_nested_list_iterator;

import dev.alexengrig.leetcode.design._341_flatten_nested_list_iterator.NestedIterator.NestedInteger;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class NestedIteratorTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of((Function<List<NestedInteger>, NestedIterator>) StackNestedIterator::new),
                Arguments.of((Function<List<NestedInteger>, NestedIterator>) LazyNestedIterator::new)
        );
    }

    static NestedList list(int... values) {
        return new NestedList(Arrays.stream(values)
                .mapToObj(NestedNumber::new)
                .collect(Collectors.toList()));
    }

    static NestedInteger list(NestedInteger... values) {
        return new NestedList(Arrays.stream(values)
                .collect(Collectors.toList()));
    }

    static NestedNumber num(int value) {
        return new NestedNumber(value);
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(Function<List<NestedInteger>, NestedIterator> iterProducer) {
        List<NestedInteger> input = List.of(list(1, 1), num(2), list(1, 1));
        Integer[] expected = {1, 1, 2, 1, 1};
        List<Integer> actual = new ArrayList<>(expected.length);
        NestedIterator iterator = iterProducer.apply(input);
        while (iterator.hasNext()) {
            actual.add(iterator.next());
        }
        assertArrayEquals(expected, actual.toArray(Integer[]::new));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Function<List<NestedInteger>, NestedIterator> iterProducer) {
        List<NestedInteger> input = List.of(num(1), list(num(4), list(6)));
        Integer[] expected = {1, 4, 6};
        List<Integer> actual = new ArrayList<>(expected.length);
        NestedIterator iterator = iterProducer.apply(input);
        while (iterator.hasNext()) {
            actual.add(iterator.next());
        }
        assertArrayEquals(expected, actual.toArray(Integer[]::new));
    }

    static class NestedNumber implements NestedInteger {
        private final int value;

        NestedNumber(int value) {
            this.value = value;
        }

        @Override
        public boolean isInteger() {
            return true;
        }

        @Override
        public Integer getInteger() {
            return value;
        }

        @Override
        public List<NestedInteger> getList() {
            return null;
        }
    }

    static class NestedList implements NestedInteger {
        private final List<NestedInteger> values;

        NestedList(List<NestedInteger> values) {
            this.values = values;
        }

        @Override
        public boolean isInteger() {
            return false;
        }

        @Override
        public Integer getInteger() {
            return null;
        }

        @Override
        public List<NestedInteger> getList() {
            return values;
        }
    }
}