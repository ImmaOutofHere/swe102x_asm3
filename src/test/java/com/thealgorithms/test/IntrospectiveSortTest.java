package com.thealgorithms.test;

import com.thealgorithms.sorts.IntrospectiveSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntrospectiveSortTest {

    @Test
    void sort() {
        Integer[][] to_add_input = new Integer[][]{{5, 2, 9, 1, 5}, {}, {-3,-8,-1,-6}, {42}, {7,7}};
        Integer[][] to_add_expected = new Integer[][]{{1,2,5,5,9}, {}, {-8,-6,-3,-1}, {42}, {7,7}};
        String[] messages = new String[]{"Test 1: Normal", "Test 2: Empty", "Test 3: Negative", "Test 4: Single", "Test 5: Duplicates"};
        for (int i = 0; i < to_add_input.length; i++){
            System.out.println(messages[i]);
            Assertions.assertArrayEquals(to_add_expected[i], IntrospectiveSort.sort(to_add_input[i]));
            System.out.printf("Test %d completed\n", i+1);

        }
    }
}