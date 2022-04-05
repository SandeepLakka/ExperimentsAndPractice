package com.self.practice.arrays;

/**
 * Problem Statement : Given an unsorted array <b>arr</b> of size N,
 * rotate it by D elements (clockwise).
 * <p>
 * Input : arr = [1, 2, 3, 4, 5], D = 2
 * Output : [3, 4, 5, 1, 2]
 * <p>
 * Input : arr = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20], D = 3
 * Output : [8, 10, 12, 14, 16, 18, 20, 2, 4, 6]
 * <p>
 * Note: This is not usual array rotation but a cyclical rotation clockwise
 */
public class RotateArray {

    public int[] naiveSolution(int[] arr, int D) {
        //0, 1, 2, 3, 4     //  5
        //2, 3, 4, 5, 6
        //2, 3, 4, 0, 1
        //
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int idx = (i + D) % arr.length;
            res[i] = arr[idx];
        }
        return res;
    }

    //TODO clever approaches

}
