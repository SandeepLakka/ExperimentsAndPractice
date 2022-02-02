package com.self.datastructures.tree.heap;
/*
      10
    /    \
   20     15
  /  \   /  \
 40  50 100  25
/
45

Insert 12
 */
public class InsertIntoBinaryHeap {

    public int[] insert(BinaryHeap heap, int insertKey){
        int[] arr = heap.getArr();
        int size = heap.getSize();
        if(size == heap.getCapacity()){
            return arr;
        }
        arr[size++] = insertKey;
        int currIndex = size - 1;
        int parentIndex = heap.getParent(currIndex);

        while(currIndex != 0 && arr[currIndex] < arr[parentIndex]){
            int temp = arr[parentIndex];
            arr[parentIndex] = arr[currIndex];
            arr[currIndex] = temp;

            currIndex = parentIndex;
            parentIndex = heap.getParent(currIndex);
        }
        return arr;
    }
}
