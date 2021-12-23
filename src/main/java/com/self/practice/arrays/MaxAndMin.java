package com.self.practice.arrays;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

/**
 * Problem Statement:   Find the maximum and minimum elements in an array of integers with minimum number of comparisons
 * And also explain the number of comparisons done for result
 * Examples
 * Input    : arr = [1000, 11, 445, 1, 330, 3000]   Output : [3000, 1]
 * Input    : arr = [-1, 10, 200, 120, 500,  100]   Output : [500, -1]
 */
public class MaxAndMin {

    //bruteforce solution
    //Number of Comparisons = 2N
    public int[] naiveSolution(int[] arr) {
        if (arr == null || arr.length == 0) return arr;
        IntSummaryStatistics stats = Arrays.stream(arr).summaryStatistics();
        return new int[]{stats.getMax(), stats.getMin()};
    }

    //Number of Comparisons = 2(N-2) + 1 in worst case, N - 1 in best case
    public int[] naiveSolutionV2(int[] arr) {
        if (arr == null || arr.length == 0) return arr;

        if (arr.length < 2) return new int[]{arr[0], arr[0]};

        int min, max;

        if (arr[0] > arr[1]) {
            min = arr[1];
            max = arr[0];
        } else {
            min = arr[0];
            max = arr[1];
        }

        for (int idx = 2; idx < arr.length; idx++) {
            if (arr[idx] < min) min = arr[idx];
            else if (arr[idx] > max) max = arr[idx];
        }
        return new int[]{max, min};
    }

    //TODO clever approach
    //There are other approaches by name "Tournament Method"
    //And "Compare in Pairs" method both with 3n/2 -2 operations


}
