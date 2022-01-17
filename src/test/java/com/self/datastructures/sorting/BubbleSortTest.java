package com.self.datastructures.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    public void testSortUsingBubbleSort(){
        BubbleSort bubbleSort = new BubbleSort();
        assertArrayEquals(new int[]{1,2,3,4,5}, bubbleSort.sortUsingBubbleSort(new int[]{5,2,4,1,3}));
    }

}