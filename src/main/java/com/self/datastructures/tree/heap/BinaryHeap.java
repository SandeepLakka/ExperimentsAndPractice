package com.self.datastructures.tree.heap;

import java.util.Arrays;

public class BinaryHeap {

    private int[] arr;
    private int size;
    private int capacity;

    public BinaryHeap(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
    }

    public int[] getArr(){
        return arr;
    }

    public int getSize(){
        return (int)Arrays.stream(arr)
                .filter(x -> x!=0)
                .count();
    }

    public int getCapacity(){
        return capacity;
    }

    public int getParent(int i){
        return (i-1)/2;
    }

    public int getLeft(int i){
        return 2*i + 1;
    }

    public int getRight(int i){
        return 2*i + 2;
    }
}
