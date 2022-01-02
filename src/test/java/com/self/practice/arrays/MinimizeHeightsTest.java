package com.self.practice.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimizeHeightsTest {

    private MinimizeHeights testObject;

    @BeforeEach
    public void init() {
        testObject = new MinimizeHeights();
    }

    @Test
    public void test_naiveSolution() {
        assertEquals(5, testObject.naiveSolution(new int[]{1, 5, 8, 10}, 2));
        assertEquals(11, testObject.naiveSolution(new int[]{3, 9, 12, 16, 20}, 3));
        assertEquals(3, testObject.naiveSolution(new int[]{0, 1, 1, 1, 3}, 3));
        assertEquals(0, testObject.naiveSolution(new int[]{4, 4, 4}, 5));
    }

    @Test
    void test_better() {
        assertEquals(5, testObject.better(new int[]{1, 5, 8, 10}, 2));
        assertEquals(11, testObject.better(new int[]{3, 9, 12, 16, 20}, 3));
        assertEquals(3, testObject.better(new int[]{0, 1, 1, 1, 3}, 3));
        assertEquals(0, testObject.better(new int[]{4, 4, 4}, 5));
    }
}