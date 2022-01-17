package com.self.datastructures.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    @Test
    public void testSortUsingSelectionSort(){
        SelectionSort selectionSort = new SelectionSort();
        assertArrayEquals(new int[]{1,2,3,4,5}, selectionSort.sortUsingSelectionSort(new int[]{4,1,5,2,3}));
    }
}