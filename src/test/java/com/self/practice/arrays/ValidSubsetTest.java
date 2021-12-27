package com.self.practice.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidSubsetTest {

    private ValidSubset testObject;

    @BeforeEach
    public void init() {
        testObject = new ValidSubset();
    }


    @Test
    void test_naiveSolution() {
        assertTrue(testObject.naiveSolution(new int[]{5, 1, 22, 25, 6, -1, 8, 10}, new int[]{5, 1, 22, 25, 6, -1, 8, 10}));
        assertTrue(testObject.naiveSolution(new int[]{5, 1, 22, 25, 6, -1, 8, 10}, new int[]{5, 1, 22, 6, -1, 8, 10}));
        assertFalse(testObject.naiveSolution(new int[]{5, 1, 22, 25, 6, -1, 8, 10}, new int[]{1, 5, 10}));
        assertFalse(testObject.naiveSolution(new int[]{5, 1, 22, 25, 6, -1, 8, 10}, new int[]{5, 1, 22, 22, 25, 6, -1, 8, 10}));
        assertTrue(testObject.naiveSolution(new int[]{10, 10, 10}, new int[]{10, 10}));
        assertFalse(testObject.naiveSolution(new int[]{10, 20, 30}, new int[]{50}));
        assertFalse(testObject.naiveSolution(new int[]{10}, new int[]{10, 10}));
        assertTrue(testObject.naiveSolution(new int[]{5, 1, 22, 25, 6, -1, 8, 10}, new int[]{1, 6, -1, 10}));
        assertFalse(testObject.naiveSolution(new int[]{1, 5, 2, 3, 5, 2}, new int[]{1, 1, 2}));
        assertTrue(testObject.naiveSolution(new int[]{1, 1, 2, 3, 5, 7}, new int[]{1, 1, 2}));
    }
}