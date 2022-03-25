package com.self.practice.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExcelColumnNumberTest {

    private ExcelColumnNumber underTest;

    @BeforeEach
    public void init() {
        underTest = new ExcelColumnNumber();
    }

    @Test
    void titleToNumber() {
        assertEquals(1, underTest.titleToNumber("A"));
        assertEquals(28, underTest.titleToNumber("AB"));
        assertEquals(76, underTest.titleToNumber("BX"));
        assertEquals(1060, underTest.titleToNumber("ANT"));
        assertEquals(923, underTest.titleToNumber("AIM"));
        assertEquals(784, underTest.titleToNumber("ADD"));
        assertEquals(57, underTest.titleToNumber("BE"));
    }
}