package com.self.datastructures.sorting;

/**
 * BubbleSort is a stable sorting algorithm. Each element is compared with its next element and swapped so that at the
 * end of 1st iteration largest element is present at the end, by the end of 2nd iteration 2nd largest element is present
 * at last but one position.
 * Ex: 2,10,8,7
 * After 1st iteration 2,8,7,10
 * After 2nd iteration 2,7,8,10
 * After 3rd iteration 2,7,8,10
 */
public class BubbleSort {

    public int[] sortUsingBubbleSort(int[] arr){
        for(int i=0; i< arr.length-1; i++){
            boolean isSwapped = false;
            for(int j=0; j< arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    isSwapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(!isSwapped){
                break;
            }
        }
        return arr;
    }
}
