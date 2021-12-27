package com.self.practice.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortedSquaredArrayTest {
    private SortedSquaredArray testObject;

    @BeforeEach
    public void init() {
        testObject = new SortedSquaredArray();
    }

    @Test
    void test_naiveSolution() {
        assertArrayEquals(new int[]{0, 1, 9, 16, 100},
                testObject.naiveSolution(new int[]{-4, -1, 0, 3, 10}));
        assertArrayEquals(new int[]{0, 1, 9, 16, 100},
                testObject.naiveSolution(new int[]{-4, -1, 0, 3, 10}));
        assertArrayEquals(new int[]{0, 0, 1, 4, 9},
                testObject.naiveSolution(new int[]{0, 0, 1, 2, 3}));
        assertArrayEquals(new int[]{1, 16},
                testObject.naiveSolution(new int[]{-4, -1}));
    }

    @Test
    void test_sortedMergeSolution() {
        assertArrayEquals(new int[]{1, 9, 16},
                testObject.mergeSolution(new int[]{-4, -3, -1}));
        assertArrayEquals(new int[]{0, 1, 9, 16},
                testObject.mergeSolution(new int[]{-4, -3, -1, 0}));
        assertArrayEquals(new int[]{0, 1, 9, 16, 100},
                testObject.mergeSolution(new int[]{-4, -1, 0, 3, 10}));
        assertArrayEquals(new int[]{0, 1, 9, 16, 100},
                testObject.mergeSolution(new int[]{-4, -1, 0, 3, 10}));
        assertArrayEquals(new int[]{0, 0, 1, 4, 9},
                testObject.mergeSolution(new int[]{0, 0, 1, 2, 3}));
        assertArrayEquals(new int[]{1, 16},
                testObject.mergeSolution(new int[]{-4, -1}));
    }

    @Test
    void testTwoPointerSolution() {
        assertArrayEquals(new int[]{1, 9, 16},
                testObject.twoPointerApproach(new int[]{-4, -3, -1}));
        assertArrayEquals(new int[]{0, 1, 9, 16},
                testObject.twoPointerApproach(new int[]{-4, -3, -1, 0}));
        assertArrayEquals(new int[]{0, 1, 9, 16, 100},
                testObject.twoPointerApproach(new int[]{-4, -1, 0, 3, 10}));
        assertArrayEquals(new int[]{0, 1, 9, 16, 100},
                testObject.twoPointerApproach(new int[]{-4, -1, 0, 3, 10}));
        assertArrayEquals(new int[]{0, 0, 1, 4, 9},
                testObject.twoPointerApproach(new int[]{0, 0, 1, 2, 3}));
        assertArrayEquals(new int[]{1, 16},
                testObject.twoPointerApproach(new int[]{-4, -1}));
    }
}