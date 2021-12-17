package com.self.practice.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Problem Statement : Given an input array <b>nums</b> and an integer <b>k</b> ,
 * return indices of array <b>nums</b> of the two numbers such that they
 * add up to <b>k</b> else return null
 * <p>
 * Example:
 * Input : nums = [2,7,11,15], target = 9       --->    output = [0,1]
 * Input : nums = [3,2,4], target = 6           --->    output = [1,2]
 * Input : nums = [1,3,5], target = 10          --->    output = null
 * <p>
 * Note: Comment about the time and space complexities as comments over your
 * methods
 */
public class TwoSum {

    public int[] naiveSolution(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) return new int[]{i, j};
            }
        }
        return null;
    }

    public int[] mapBasedSolution(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        int complement;
        for (int i = 0; i < nums.length; i++) {
            complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
        }
        return null;
    }
    //TODO Try writing programs which have sub-quadratic time complexity without using map or similar datastructure

    //O(NlogN) time complexity with O(N) space complexity without using maps
    //Bit crude, has chance to refactor to be cute/cuter
    public int[] subQuadSolutionWithoutMaps(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        //O(N) space complexity to return appropriate indices  if there is 2 sum
        int[] original = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            original[i] = nums[i];
        }
        //O(NlogN) time complexity assuming merge sort )
        Arrays.sort(nums);

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{getIndex(original, -1, nums[left]), getIndex(original, getIndex(original, -1, nums[left]), nums[right])};
            }
            if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return null;
    }

    int getIndex(int[] original, int existing, int value) {
        for (int i = 0; i < original.length; i++) {
            if (i == existing) continue;
            if (original[i] == value) {
                return i;
            }
        }
        return -1;
    }

}
