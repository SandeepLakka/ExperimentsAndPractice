package com.self.practice.arrays;


import com.self.exception.NotYetImplementedException;

import java.util.Arrays;

/**
 * Problem Statement : Given an array <b>arr</b> consisting of heights of towers, and a positive integer <b>K</b>,
 * you have to modify the height of each tower either by increasing or decreasing them by K only once.
 * <p>
 * Note: Height should be a non-negative integer after modifying.
 * <p>
 * Find out what could be the possible minimum difference of the height of shortest and longest towers
 * after you have modified each tower.
 * <p>
 * Examples:
 * Input: arr = [1, 5, 8, 10], K = 2       Output  : 5
 * Reason: Array will be modified as [3, 3, 6, 8] and diff is 5
 * <p>
 * Input: arr = [3, 9, 12, 16, 20], K = 3  Output  : 11
 * Reason: Array will be modifed as [6, 12, 9, 13, 17] and diff is 11
 * <p>
 * Expected Time complexity : O(NlogN)
 * Expected Auxiliary Space : O(N)
 */
public class MinimizeHeights {

    //O(NlogN) time O(N) space due to sorting
    public int naiveSolution(int[] arr, int k) {
        Arrays.sort(arr);
        int min = arr[0] + k;
        int max = arr[arr.length - 1] + (arr[arr.length - 1] - k >= 0 ? -k : k);
        return Math.abs(max - min);
    }

    //Linear time and constant space
    public int better(int[] arr, int k) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int val : arr) {
            if (val < min) {
                min = val;
            }
            if (val > max) {
                max = val;
            }
        }
        //<pre>
        //Max height    Min height      Resulting difference    Constraints
        //max + k   -   ( min + k ) =>  max - min			    max + k >= 0 && min + k >= 0
        //max + k   -   ( min - k ) =>  max - min + 2k		    max + k >= 0 && min - k >= 0
        //max - k   -   ( min + k ) =>  max - min - 2k		    max - k >= 0 && min + k >= 0 -> max - min - 2k >= 0 -> max - min >= 2k ? max -min -2k : max -min
        //max - k   -   ( min - k ) =>  max - min			    max - k >= 0 && min - k >= 0
        //</pre>
        return (max - min >= 2 * k) ? max - min - 2 * k : max - min;
    }
}
