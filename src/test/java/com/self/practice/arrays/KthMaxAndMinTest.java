package com.self.practice.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthMaxAndMinTest {
    KthMaxAndMin testObject;

    @BeforeEach
    public void init() {
        testObject = new KthMaxAndMin();
    }

    @Test
    void test_naiveSolution() {
        assertNull(testObject.naiveSolution(null, 1));
        assertArrayEquals(testObject.naiveSolution(new int[]{7, 10, 4, 3, 20, 15}, 3), new int[]{10, 7});
        assertArrayEquals(testObject.naiveSolution(new int[]{1, 1, 1}, 2), new int[]{1, 1});
        assertArrayEquals(testObject.naiveSolution(new int[]{0}, 1), new int[]{0, 0});
        assertArrayEquals(testObject.naiveSolution(new int[]{-1, -2, -3, 0, 3, 2, 1}, 2), new int[]{2, -2});
    }

    @Test
    void test_heapSolution() {
        assertNull(testObject.heapSolution(null, 1));
        assertArrayEquals(testObject.heapSolution(new int[]{7, 10, 4, 3, 20, 15}, 3), new int[]{10, 7});
        assertArrayEquals(testObject.heapSolution(new int[]{1, 1, 1}, 2), new int[]{1, 1});
        assertArrayEquals(testObject.heapSolution(new int[]{0}, 1), new int[]{0, 0});
        assertArrayEquals(testObject.heapSolution(new int[]{-1, -2, -3, 0, 3, 2, 1}, 2), new int[]{2, -2});
    }
}