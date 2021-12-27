package com.self.practice.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxAndMinTest {

    private MaxAndMin testObject;

    @BeforeEach
    public void init() {
        testObject = new MaxAndMin();
    }

    @Test
    void test_naiveSolution() {
        assertNull(testObject.naiveSolution(null));
        assertArrayEquals(new int[]{}, testObject.naiveSolution(new int[]{}));
        assertArrayEquals(new int[]{3000, 1}, testObject.naiveSolution(new int[]{1000, 11, 445, 1, 330, 3000}));
        assertArrayEquals(new int[]{500, -1}, testObject.naiveSolution(new int[]{-1, 10, 200, 120, 500, 100}));
        assertArrayEquals(new int[]{1, 1}, testObject.naiveSolution(new int[]{1, 1, 1, 1}));
    }

    @Test
    void test_naiveSolutionV2() {
        assertNull(testObject.naiveSolutionV2(null));
        assertArrayEquals(testObject.naiveSolutionV2(new int[]{}), new int[]{});
        assertArrayEquals(new int[]{3000, 1}, testObject.naiveSolutionV2(new int[]{1000, 11, 445, 1, 330, 3000}));
        assertArrayEquals(new int[]{500, -1}, testObject.naiveSolutionV2(new int[]{-1, 10, 200, 120, 500, 100}));
        assertArrayEquals(new int[]{1, 1}, testObject.naiveSolutionV2(new int[]{1, 1, 1, 1}));
    }
}