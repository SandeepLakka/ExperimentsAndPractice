package com.self.practice.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GreaterOrLesserTest {

    private GreaterOrLesser underTest;

    @BeforeEach
    public void init() {
        underTest = new GreaterOrLesser();
    }

    @Test
    void test_solve_input1() {
        List<Integer> A, B;
        int C, expectedResult;
        A = Arrays.asList(1, 2, 3, 4);
        B = Arrays.asList(5, 6, 7, 8);
        C = 4;
        expectedResult = 0;
        assertEquals(expectedResult, underTest.solve(A, B, C));
    }

    @Test
    void test_solve_input2() {
        List<Integer> A, B;
        int C, expectedResult;
        A = Arrays.asList(1, 10, 100);
        B = Arrays.asList(9, 9, 9);
        C = 50;
        expectedResult = 3;
        assertEquals(expectedResult, underTest.solve(A, B, C));
    }
}