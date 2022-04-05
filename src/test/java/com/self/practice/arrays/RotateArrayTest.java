package com.self.practice.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {

    private RotateArray testObject;

    @BeforeEach
    public void init() {
        testObject = new RotateArray();
    }

    @Test
    void test_naiveSolution() {
        assertArrayEquals(new int[]{3, 4, 5, 1, 2},
                testObject.naiveSolution(new int[]{1, 2, 3, 4, 5}, 2));
        assertArrayEquals(new int[]{8, 10, 12, 14, 16, 18, 20, 2, 4, 6},
                testObject.naiveSolution(new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20}, 3));
        assertArrayEquals(new int[]{1, 2}, testObject.naiveSolution(new int[]{2, 1}, 1));
    }
}