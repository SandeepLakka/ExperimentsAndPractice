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
        assertArrayEquals(testObject.naiveSolution(new int[]{-4, -1, 0, 3, 10}),
                new int[]{0, 1, 9, 16, 100});
        assertArrayEquals(testObject.naiveSolution(new int[]{-4, -1, 0, 3, 10}),
                new int[]{0, 1, 9, 16, 100});
        assertArrayEquals(testObject.naiveSolution(new int[]{0, 0, 1, 2, 3}),
                new int[]{0, 0, 1, 4, 9});
        assertArrayEquals(testObject.naiveSolution(new int[]{-4, -1}),
                new int[]{1, 16});
    }
}