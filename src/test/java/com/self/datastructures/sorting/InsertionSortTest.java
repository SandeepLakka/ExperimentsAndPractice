package com.self.datastructures.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    @Test
    public void sortUsingInsertionSort(){
        InsertionSort insertionSort = new InsertionSort();
        assertArrayEquals(new int[]{1,2,3,4,5}, insertionSort.sortUsingInsertionSort(new int[]{5,1,4,2,3}));
    }
}