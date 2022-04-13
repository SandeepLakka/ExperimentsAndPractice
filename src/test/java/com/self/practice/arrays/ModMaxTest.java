package com.self.practice.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ModMaxTest {

    private ModMax underTest;

    @BeforeEach
    void setUp() {
        underTest = new ModMax();
    }

    @Test
    void test_solve() {
        List<Integer> list = Arrays.asList(1, 2, 44, 3);
        assertEquals(3, underTest.solve(list));

        list = Arrays.asList(2, 6, 4);
        assertEquals(4, underTest.solve(list));

        list = Collections.singletonList(1);
        assertEquals(0, underTest.solveBetter(list));

        list = Arrays.asList(3, 3, 3);
        assertEquals(0, underTest.solveBetter(list));
    }

    @Test
    void test_solveBetter() {
        List<Integer> list = Arrays.asList(1, 2, 44, 3);
        assertEquals(3, underTest.solveBetter(list));

        list = Arrays.asList(2, 6, 4);
        assertEquals(4, underTest.solveBetter(list));

        list = Collections.singletonList(1);
        assertEquals(0, underTest.solveBetter(list));

        list = Arrays.asList(3, 3, 3);
        assertEquals(0, underTest.solveBetter(list));
    }

    @Test
    void test_solveBetterer() {
        List<Integer> list = Arrays.asList(1, 2, 44, 3);
        assertEquals(3, underTest.solveBetterer(list));

        list = Arrays.asList(2, 6, 4);
        assertEquals(4, underTest.solveBetterer(list));

        list = Collections.singletonList(1);
        assertEquals(0, underTest.solveBetterer(list));

        list = Arrays.asList(3, 3, 3);
        assertEquals(0, underTest.solveBetterer(list));
    }


}