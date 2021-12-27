package com.self.practice.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.BiFunction;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    private TwoSum testObject;

    @BeforeEach
    public void init() {
        testObject = new TwoSum();
    }

    @Test
    void test_naiveSolution() {
        assertArrayEquals(new int[]{0, 1}, testObject.naiveSolution(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{1, 2}, testObject.naiveSolution(new int[]{3, 2, 4}, 6));
        assertNull(testObject.naiveSolution(new int[]{1, 3, 5}, 10));
    }

    @Test
    void test_mapBasedSolution() {
        assertArrayEquals(new int[]{0, 1}, testObject.mapBasedSolution(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{1, 2}, testObject.mapBasedSolution(new int[]{3, 2, 4}, 6));
        assertNull(testObject.mapBasedSolution(new int[]{1, 3, 5}, 10));
    }

    @Test
    void test_subQuadSolutionWithoutMaps() {
        assertArrayEquals(new int[]{0, 1}, testObject.subQuadSolutionWithoutMaps(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{1, 2}, testObject.subQuadSolutionWithoutMaps(new int[]{3, 2, 4}, 6));
        assertNull(testObject.subQuadSolutionWithoutMaps(new int[]{1, 3, 5}, 10));
    }
}