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

    @Disabled("YTD")
    @Test
    public void test_naiveSolution() {
        assertEquals(5, testObject.naiveSolution(new int[]{1, 5, 8, 10}, 2));
        assertEquals(11, testObject.naiveSolution(new int[]{3, 9, 12, 16, 20}, 3));

    }

}