package com.self.practice.arrays;

import com.self.exception.NotYetImplementedException;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Problem Statement:   Find the maximum and minimum elements in an array of integers with minimum number of comparisons
 * And also explain the number of comparisons done for result
 * Examples
 * Input    : arr = [1000, 11, 445, 1, 330, 3000]   Output : [3000, 1]
 * Input    : arr = [-1, 10, 200, 120, 500,  100]   Output : [500, -1]
 */
public class MaxAndMin {

    //bruteforce solution
    public int[] naiveSolution(int[] arr) {
        if (arr == null || arr.length == 0) return arr;
        IntSummaryStatistics stats = Arrays.stream(arr).summaryStatistics();
        return new int[]{stats.getMax(), stats.getMin()};
    }

    //TODO clever approach

}
