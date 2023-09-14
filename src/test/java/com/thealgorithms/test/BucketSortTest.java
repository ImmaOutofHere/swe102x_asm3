package com.thealgorithms.test;

import com.thealgorithms.sorts.BucketSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BucketSortTest {

    @Test
    void testPositiveNumbers() {
        Integer[] input = {5, 2, 9, 1, 5};
        Integer[] expected = {1, 2, 5, 5, 9};
        Assertions.assertArrayEquals(expected, BucketSort.sort(input));
    }

    /** currently unusable, due to array index out of bounds error**/
    @Test
    void testEmptyArray() {
        Integer[] input = {};
        Integer[] expected = {};
        assertArrayEquals(expected, BucketSort.sort(input));
    }

    @Test
    void testNegativeNumbers() {
        Integer[] input = {-3, -8, -1, -6};
        Integer[] expected = {-8, -6, -3, -1};
        assertArrayEquals(expected, BucketSort.sort(input));
    }

    @Test
    void testSingleElement() {
        Integer[] input = {42};
        Integer[] expected = {42};
        assertArrayEquals(expected, BucketSort.sort(input));
    }

    @Test
    void testIdenticalElements() {
        Integer[] input = {7, 7};
        Integer[] expected = {7, 7};
        assertArrayEquals(expected, BucketSort.sort(input));
    }
}