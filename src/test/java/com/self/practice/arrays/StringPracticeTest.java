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
        assertEquals(testObject.naiveSolution("hello"), "olleh");
        assertEquals(testObject.naiveSolution("world"), "dlrow");
        assertEquals(testObject.naiveSolution(""), "");
        assertThrows(IllegalArgumentException.class, () -> testObject.naiveSolution(null));
    }

    @Test
    void test_stringBuilderSolution() {
        assertEquals(testObject.stringBuilderSolution("hello"), "olleh");
        assertEquals(testObject.stringBuilderSolution("world"), "dlrow");
        assertEquals(testObject.stringBuilderSolution(""), "");
        assertThrows(IllegalArgumentException.class, () -> testObject.stringBuilderSolution(null));
    }
}