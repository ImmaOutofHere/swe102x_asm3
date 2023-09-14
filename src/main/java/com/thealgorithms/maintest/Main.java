package com.thealgorithms.maintest;


import com.thealgorithms.sorts.BeadSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(BeadSort.sort((new int[]{1, 4, 5, 4, 3, 2, 2, 4, 1, 4, 5}))));
    }
}
