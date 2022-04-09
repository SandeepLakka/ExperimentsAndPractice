package com.self.practice.arrays;

/**
 * This problem was recently asked by Twitter:
 * <p>
 * Given a list of numbers, find the smallest window to sort
 * such that the whole list will be sorted.
 * If the list is already sorted return (0, 0).
 * You can assume there will be no duplicate numbers.
 * <p>
 * Example:
 * <p>
 * Input: [2, 4, 7, 5, 6, 8, 9]
 * Output: (2, 4)
 * <p>
 * Explanation: Sorting the window (2, 4) which is [7, 5, 6]
 * will also mean that the whole list is sorted.
 */
public class SortingWindowRange {

    public int[] minWindowToSort(int[] arr) {
        int max = Integer.MIN_VALUE;
        int highIndex = 0, lowIndex = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (arr[i] < max) {
                highIndex = i;
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (arr[i] > min) {
                lowIndex = i;
            }
        }

        return new int[]{lowIndex, highIndex};

    }
}
