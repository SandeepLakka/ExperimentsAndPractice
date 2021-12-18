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

    //bruteforce
    public int[] naiveSolution(int[] nums) {
        int[] sortedArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sortedArray[i] = nums[i] * nums[i];
        }
        Arrays.sort(sortedArray);
        return sortedArray;
    }

    //clever approaches
    public int[] mergeSolution(int[] nums) {
        int index = -1;
        boolean isNegatives = nums[0] < 0;
        //Finding the index at which the sign shift happens (if there's any)
        if (nums[0] < 0 && nums[nums.length - 1] >= 0) {
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] < 0) {
                    index = i;
                    break;
                }
            }
        }
        //Square the input array elements
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }

        if (index == -1) {
            if (!isNegatives) {
                //all non-negatives case
                //Return squared input array
                return nums;
            } else {
                //all negatives case
                //Return reversed squared inputs array
                int temp;
                int left = 0;
                int right = nums.length - 1;
                while (left < right) {
                    temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                    left++;
                    right--;
                }
                return nums;
            }
        } else {
            //mixed inputs ( -ves, non -ves ) : Real meat!!
            int positives = index + 1;
            int negatives = index;
            //O(N) space for now.
            //Will try for inplace modification later
            int[] sortedArr = new int[nums.length];
            int ind = 0;
            while (ind < nums.length) {
                //edge case 1
                if (positives == nums.length) {
                    while (negatives >= 0) {
                        sortedArr[ind] = nums[negatives];
                        negatives--;
                        ind++;
                    }
                    break;
                }
                //edge case 2
                if (negatives == -1) {
                    while (positives < nums.length) {
                        sortedArr[ind] = nums[positives];
                        positives++;
                        ind++;
                    }
                    break;
                }
                //normal check
                if (nums[negatives] < nums[positives]) {
                    sortedArr[ind] = nums[negatives];
                    negatives--;
                } else {
                    sortedArr[ind] = nums[positives];
                    positives++;
                }
                ind++;
            }
            return sortedArr;
        }
    }

    /**
     * Two pointer approach
     */
    public int[] twoPointerApproach(int[] nums){
        int[] newArr = new int[nums.length];
        int i = nums.length-1;
        for(int l=0,r=nums.length-1; l<=r;) {
            if(Math.abs(nums[l]) < Math.abs(nums[r])){
                newArr[i] = Math.abs(nums[r])*Math.abs(nums[r]);
                i--; r--;
            } else if (Math.abs(nums[l]) > Math.abs(nums[r])){
                newArr[i] = Math.abs(nums[l])*Math.abs(nums[l]);
                i--;l++;
            } else {
                newArr[i] = Math.abs(nums[r])*Math.abs(nums[r]);
                l++;
            }
        }
        return newArr;
    }
    //TODO cleverer approaches

}
