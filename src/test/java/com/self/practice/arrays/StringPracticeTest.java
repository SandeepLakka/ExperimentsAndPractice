package com.self.practice.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringPracticeTest {

    private StringPractice testObject;

    @BeforeEach
    public void init() {
        testObject = new StringPractice();
    }

    @Test
    void test_naiveSolution() {
        assertEquals("olleh", testObject.naiveSolution("hello"));
        assertEquals("dlrow", testObject.naiveSolution("world"));
        assertEquals("", testObject.naiveSolution(""));
        assertThrows(IllegalArgumentException.class, () -> testObject.naiveSolution(null));
    }

    @Test
    void test_stringBuilderSolution() {
        assertEquals("olleh", testObject.stringBuilderSolution("hello"));
        assertEquals("dlrow", testObject.stringBuilderSolution("world"));
        assertEquals("", testObject.stringBuilderSolution(""));
        assertThrows(IllegalArgumentException.class, () -> testObject.stringBuilderSolution(null));
    }
}