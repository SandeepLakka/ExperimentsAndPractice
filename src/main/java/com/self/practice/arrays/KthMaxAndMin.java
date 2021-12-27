package com.self.practice.arrays;

import com.self.datastructures.Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Problem Statement : Given an array arr[] and an integer K,
 * Find the Kth largest and smallest element in the given array.
 * Conditions   :   K  <= arr.length
 * Assume       :   It is given that all array elements are distinct.
 * <p>
 * Examples:
 * Input    :   arr = [7, 10, 4, 3, 20, 15] , K = 3 --->    Output: [10, 7]
 * Input    :   arr = [1, 1, 1]             , K = 2 --->    Output: [1, 1]
 */
public class KthMaxAndMin {

    //bruteforce/naive solution
    public int[] naiveSolution(int[] arr, int k) {
        if (arr == null || k == 0 || k > arr.length) return null;
        //Sort and then process
        Arrays.sort(arr);
        return new int[]{arr[arr.length - k], arr[k - 1]};
    }

    //Heap/PriorityQueue approach
    //Time : O(NlogK), Space : O(K)
    public int[] heapSolution(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k == 0) return null;
        Heap heap = new Heap();
        PriorityQueue<Integer> max = heap.getMaxHeapFromPriorityQueue();
        PriorityQueue<Integer> min = heap.getMinHeapFromPriorityQueue();

        for (int i = 0; i < arr.length; i++) {
            min.add(arr[i]);
            max.add(arr[i]);
            if (i > k - 1) {
                min.poll();
                max.poll();
            }
        }
        return new int[]{min.poll(), max.poll()};
    }

    //TODO : Linear algorithm

}
