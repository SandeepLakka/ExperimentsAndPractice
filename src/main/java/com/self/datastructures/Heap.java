package com.self.datastructures;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Heap {

    //TODO : Implement heaps  ( Min Heap and Max Heap )

    //Min Heap using priority queue
    public PriorityQueue<Integer> getMinHeapFromPriorityQueue() {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        return minHeap;
    }

    //Max Heap using priority queue
    public PriorityQueue<Integer> getMaxHeapFromPriorityQueue() {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        return maxHeap;
    }

}
