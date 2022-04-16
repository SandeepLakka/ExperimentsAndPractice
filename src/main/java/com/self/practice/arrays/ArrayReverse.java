package com.self.practice.arrays;


/**
 * Problem Statement : Reverse an array in place.
 * <p>
 * Example:
 * Input : arr[] = {1, 2, 3}       --->    Output : arr[] = {3, 2, 1}
 * <p>
 * Input :  arr[] = {4, 5, 1, 2}    --->    Output : arr[] = {2, 1, 5, 4}
 * For invalid inputs (nulls), throw IllegalArgumentException
 * <p>
 * Bonus: Implement it using generics to pass any datatype array
 * <p>
 * <p>
 * Note: Comment about the time and space complexities as comments over your
 * methods
 */


public class ArrayReverse {

    public int[] naiveSolution(int[] input) {
        if (input == null || input.length == 0) {
            return input;
        }
        int temp;
        for (int i = 0; i < input.length / 2; i++) {
            temp = input[i];
            input[i] = input[input.length - i - 1];
            input[input.length - i - 1] = temp;
        }
        return input;
    }

    public int[] solveItWithTwoPointer(int[] input) {
        if (input == null || input.length == 0) {
            return input;
        }
        int temp;
        int left = 0, right = input.length - 1;
        while (left < right) {
            temp = input[left];
            input[left] = input[right];
            input[right] = temp;
            left++;
            right--;
        }
        return input;
    }
}
