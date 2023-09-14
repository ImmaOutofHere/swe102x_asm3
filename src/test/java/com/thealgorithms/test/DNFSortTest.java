package com.thealgorithms.test;

import com.thealgorithms.sorts.DNFSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DNFSortTest {

    @Test
    void testPositiveNumbers() {
        Integer[] input = {0,1,1,2,1,2,1,1,2,0};
        Integer[] expected = {0,0,1,1,1,1,1,2,2,2};
        Assertions.assertArrayEquals(expected, DNFSort.sort(input,10));
    }

    @Test
    void testEmptyArray() {
        Integer[] input = {};
        Integer[] expected = {};
        assertArrayEquals(expected, DNFSort.sort(input,0));
    }

    

    @Test
    void testSingleElement() {
        Integer[] input = {2};
        Integer[] expected = {2};
        assertArrayEquals(expected, DNFSort.sort(input,1));
    }

    @Test
    void testIdenticalElements() {
        Integer[] input = {0,0};
        Integer[] expected = {0,0};
        assertArrayEquals(expected, DNFSort.sort(input,2));
    }
}