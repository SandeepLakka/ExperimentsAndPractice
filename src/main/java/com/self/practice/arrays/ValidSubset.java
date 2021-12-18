package com.self.practice.arrays;

/**
 * Problem Statement : Given two non-empty arrays of integers <b>array</b> and <b>sub</b>,
 * Write a function that determines whether the second array <b>sub</b> is a valid subset
 * of array <b>array</b>
 * <p>
 * A valid subset of an array is a set of numbers that aren't necessarily adjacent
 * in the array but that are in the same order as they appear in the array.
 * <p>
 * <p>
 * Examples:
 * Input    : array = [5, 1, 22, 25, 6, -1, 8, 10],
 * : sub   = [1, 6, -1, 10]                    --->    Output : True
 * <p>
 * Input    : array = [1,5,2,3,5,2],
 * : sub   = [1,1,2]                           --->    Output : False
 */
public class ValidSubset {

    //TODO bruteforce solution
    public boolean naiveSolution(int[] array, int[] sub) {
        int pointer = 0;
        for (int i = 0; i < array.length; i++) {
            if (pointer == sub.length) return true;
            if (array[i] == sub[pointer]) {
                pointer++;
            }
        }

        return pointer == sub.length;

    }

    //TODO clever approaches
    //Can do in recursive approach but that is overkill for this problem


    //TODO cleverer approaches
    //naive solution seems to appropriate answer, will come back later to check if I can have better solution than this.
}
