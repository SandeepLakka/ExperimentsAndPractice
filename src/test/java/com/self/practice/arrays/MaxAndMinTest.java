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

    @Disabled("YTD")
    @Test
    void test_naiveSolution() {
        assertArrayEquals(testObject.naiveSolution(new int[]{}), new int[]{});
        assertArrayEquals(testObject.naiveSolution(new int[]{1000, 11, 445, 1, 330, 3000}), new int[]{3000, 1});
        assertArrayEquals(testObject.naiveSolution(new int[]{-1, 10, 200, 120, 500, 100}), new int[]{500, -1});

    }
}