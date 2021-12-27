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
        assertArrayEquals(new int[]{2, 1, 5, 4}, testObject.naiveSolution(new int[]{4, 5, 1, 2}));
        assertArrayEquals(new int[]{3, 2, 1}, testObject.naiveSolution(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{}, testObject.naiveSolution(new int[]{}));
        assertNull(testObject.naiveSolution(null));
    }

    @Test
    void test_solveItWithTwoPointer() {
        assertArrayEquals(new int[]{2, 1, 5, 4}, testObject.solveItWithTwoPointer(new int[]{4, 5, 1, 2}));
        assertArrayEquals(new int[]{3, 2, 1}, testObject.solveItWithTwoPointer(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{}, testObject.solveItWithTwoPointer(new int[]{}));
        assertNull(testObject.solveItWithTwoPointer(null));
    }
}