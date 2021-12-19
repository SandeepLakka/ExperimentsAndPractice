package com.self.practice.arrays;


import com.self.exception.NotYetImplementedException;

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

    public int naiveSolution(int[] arr, int K) {
        throw new NotYetImplementedException();
    }
}
