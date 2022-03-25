package com.self.practice.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleEquationResultTest {

    private SimpleEquationResult underTest;

    @BeforeEach
    public void init() {
        underTest = new SimpleEquationResult();
    }

    @Test
    void getResult() {
        assertEquals(8, underTest.getResult("3x+2", 2));
        assertEquals(2, underTest.getResult("2", 100));
        assertEquals(10, underTest.getResult("x-1", 11));
        assertEquals(-80, underTest.getResult("-9x+1", 9));
        assertEquals(8, underTest.getResult("3x+2", 2));
        assertEquals(-4, underTest.getResult("-x", 4));
        assertEquals(99, underTest.getResult("x", 99));
    }
}