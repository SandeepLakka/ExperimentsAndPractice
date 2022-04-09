package com.self.practice.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortingWindowRangeTest {

    private SortingWindowRange underTest;

    @BeforeEach
    void setUp() {
        underTest = new SortingWindowRange();
    }

    @Test
    void minWindowToSort() {
        assertArrayEquals(new int[]{2, 4},
                underTest.minWindowToSort(new int[]{2, 4, 7, 5, 6, 8, 9}));
        assertArrayEquals(new int[]{0, 0},
                underTest.minWindowToSort(new int[]{1, 2, 3, 4, 5, 6, 8, 9}));
        assertArrayEquals(new int[]{1, 5}, underTest.minWindowToSort(new int[]{2, 6, 4, 8, 10, 9, 15}));
        assertArrayEquals(new int[]{0, 0}, underTest.minWindowToSort(new int[]{1}));
    }
}