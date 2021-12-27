package com.self.datastructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class HeapTest {

    Heap heap;

    @BeforeEach
    public void init() {
        heap = new Heap();
    }

    @Test
    void test_getMinHeapFromPriorityQueue_positives() {
        PriorityQueue<Integer> minHeap = heap.getMinHeapFromPriorityQueue();
        IntStream.rangeClosed(1, 10).forEach(minHeap::add);
        assertEquals(1, minHeap.poll());
        assertEquals(2, minHeap.poll());
    }

    @Test
    void test_getMaxHeapFromPriorityQueue_positives() {
        PriorityQueue<Integer> maxHeap = heap.getMaxHeapFromPriorityQueue();
        IntStream.rangeClosed(1, 10).forEach(maxHeap::add);
        assertEquals(10, maxHeap.poll());
        assertEquals(9, maxHeap.poll());
    }

    @Test
    void test_getMinHeapFromPriorityQueue_negatives() {
        PriorityQueue<Integer> minHeap = heap.getMinHeapFromPriorityQueue();
        IntStream.rangeClosed(-10, -1).forEach(minHeap::add);
        assertEquals(-10, minHeap.poll());
        assertEquals(-9, minHeap.poll());
    }

    @Test
    void test_getMaxHeapFromPriorityQueue_negatives() {
        PriorityQueue<Integer> maxHeap = heap.getMaxHeapFromPriorityQueue();
        IntStream.rangeClosed(-10, -1).forEach(maxHeap::add);
        assertEquals(-1, maxHeap.poll());
        assertEquals(-2, maxHeap.poll());
    }

    @Test
    void test_getMinHeapFromPriorityQueue_mixed() {
        PriorityQueue<Integer> minHeap = heap.getMinHeapFromPriorityQueue();
        IntStream.rangeClosed(-10, 10).forEach(minHeap::add);
        assertEquals(-10, minHeap.poll());
        while (minHeap.size() != 1) minHeap.poll();
        assertEquals(10, minHeap.poll());
    }

    @Test
    void test_getMaxHeapFromPriorityQueue_mixed() {
        PriorityQueue<Integer> maxHeap = heap.getMaxHeapFromPriorityQueue();
        IntStream.rangeClosed(-10, 10).forEach(maxHeap::add);
        assertEquals(10, maxHeap.poll());
        while (maxHeap.size() != 1) maxHeap.poll();
        assertEquals(-10, maxHeap.poll());
    }
}