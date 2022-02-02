package com.self.datastructures.tree.heap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InsertIntoBinaryHeapTest {

    private BinaryHeap heap;

    @BeforeEach
    public void setUp(){
        heap = new BinaryHeap(10);
        int[] arr = heap.getArr();
        List<Integer> list = Arrays.asList(10,20,15,40,50,100,25,45);
        for(int i=0; i< list.size(); i++){
            arr[i] = list.get(i);
        }
    }

    @Test
    public void testInsert(){
        InsertIntoBinaryHeap insert = new InsertIntoBinaryHeap();
        assertArrayEquals(new int[]{10,12,15,20,50,100,25,45,40,0}, insert.insert(heap, 12));
    }
}