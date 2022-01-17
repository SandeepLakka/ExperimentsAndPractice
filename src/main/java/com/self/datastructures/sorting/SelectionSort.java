package com.self.datastructures.sorting;

/**
 * SelectionSort is an unstable algorithm. It is used when we require less memory write operations
 * For each iteration minimum element is identified and placed at the beginning i.e.
 * Ex: 10,5,8,20,2,18
 * After 1st iteration 2,5,8,20,10,18
 * After 2nd iteration 2,5,8,20,10,18
 * After 3rd iteration 2,5,8,20,10,18
 * After 4th iteration 2,5,8,10,20,18
 * After 5th iteration 2,5,8,10,18,20
 */
public class SelectionSort {
    public int[] sortUsingSelectionSort(int[] arr){
        for(int i=0; i < arr.length - 1; i++){
            int min_index = i;
            for(int j=i+1; j < arr.length; j++){
                if(arr[min_index] > arr[j]){
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
