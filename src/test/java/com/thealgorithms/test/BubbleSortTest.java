package com.thealgorithms.test;

import com.thealgorithms.sorts.BubbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    @Test
    void testPositiveNumbers() {
        Integer[] input = {5, 2, 9, 1, 5};
        Integer[] expected = {1, 2, 5, 5, 9};
        Assertions.assertArrayEquals(expected, BubbleSort.sort(input));
    }

    @Test
    void testEmptyArray() {
        Integer[] input = {};
        Integer[] expected = {};
        assertArrayEquals(expected, BubbleSort.sort(input));
    }

    @Test
    void testNegativeNumbers() {
        Integer[] input = {-3, -8, -1, -6};
        Integer[] expected = {-8, -6, -3, -1};
        assertArrayEquals(expected, BubbleSort.sort(input));
    }

    @Test
    void testSingleElement() {
        Integer[] input = {42};
        Integer[] expected = {42};
        assertArrayEquals(expected, BubbleSort.sort(input));
    }

    @Test
    void testIdenticalElements() {
        Integer[] input = {7, 7};
        Integer[] expected = {7, 7};
        assertArrayEquals(expected, BubbleSort.sort(input));
    }
}