package com.self.datastructures.tree.heap;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
            40
           /  \
         20    30
        /  \  /  \
       35  25 80  32
      / \  /
    100 70 60
 */
public class Heapify {

    public int[] heapify(BinaryHeap heap, int index){

        int currIndex = index;
        int leftIndex = heap.getLeft(index);
        int rightIndex = heap.getRight(index);
        int[] arr = heap.getArr();

        while(currIndex < heap.getSize() && rightIndex < heap.getSize() && leftIndex < heap.getSize() && !(arr[currIndex] < arr[rightIndex] && arr[currIndex]<arr[leftIndex])){
            if(arr[currIndex] > arr[rightIndex]){
                int temp = arr[currIndex];
                arr[currIndex] = arr[rightIndex];
                arr[rightIndex] = temp;
                currIndex = rightIndex;
            } else if (arr[currIndex] > arr[leftIndex]){
                int temp = arr[currIndex];
                arr[leftIndex] = arr[leftIndex];
                arr[leftIndex] = temp;
                currIndex = leftIndex;
            }
            rightIndex = heap.getRight(currIndex);
            leftIndex = heap.getLeft(currIndex);
        }
        return arr;
    }
}
