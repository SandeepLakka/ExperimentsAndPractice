package com.self.practice.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayReverseTest {

    private ArrayReverse testObject;

    @BeforeEach
    public void init() {
        testObject = new ArrayReverse();
    }

    @Test
    void test_naiveSolution() {
        assertArrayEquals(testObject.naiveSolution(new int[]{4, 5, 1, 2}), new int[]{2, 1, 5, 4});
        assertArrayEquals(testObject.naiveSolution(new int[]{1, 2, 3}), new int[]{3, 2, 1});
        assertArrayEquals(testObject.naiveSolution(new int[]{}), new int[]{});
        assertNull(testObject.naiveSolution(null));
    }

    @Test
    void test_solveItWithTwoPointer() {
        assertArrayEquals(testObject.solveItWithTwoPointer(new int[]{4, 5, 1, 2}), new int[]{2, 1, 5, 4});
        assertArrayEquals(testObject.solveItWithTwoPointer(new int[]{1, 2, 3}), new int[]{3, 2, 1});
        assertArrayEquals(testObject.solveItWithTwoPointer(new int[]{}), new int[]{});
        assertNull(testObject.solveItWithTwoPointer(null));
    }
}