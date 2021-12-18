package com.self.practice.arrays;

import java.util.Arrays;

/**
 * Problem statement : Given an integer array <b>nums</b> sorted in non-decreasing order,
 * return an array of the squares of each number sorted in non-decreasing order.
 * <p>
 * Examples:
 * Input: nums = [-4,-1,0,3,10]     ---> Output = [0,1,9,16,100]
 * Input: nums = [-7,-3,2,3,11]     ---> Output = [4,9,9,49,121]
 */
public class SortedSquaredArray {

    //TODO bruteforce
    public int[] naiveSolution(int[] nums) {
        int[] sortedArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sortedArray[i] = nums[i] * nums[i];
        }
        Arrays.sort(sortedArray);
        return sortedArray;
    }

    //TODO clever approaches

    //TODO cleverer approaches

}
