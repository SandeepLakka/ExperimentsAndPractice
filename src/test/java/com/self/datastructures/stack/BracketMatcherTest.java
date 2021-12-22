package com.self.datastructures.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketMatcherTest {

    BracketMatcher testObject;

    @BeforeEach
    public void init() {
        testObject = new BracketMatcher();
    }

    @Test
    void test_getNextBracketV1() {
        assertTrue(testObject.matchBracketV1("(hello)(world)(s(a(m(p)l)e)s)"));
        assertTrue(testObject.matchBracketV1(""));
        assertFalse(testObject.matchBracketV1("((hello)(world)"));
        assertTrue(testObject.matchBracketV1("hel(lo)(wor)ld"));
        assertFalse(testObject.matchBracketV1("())(()"));
        assertFalse(testObject.matchBracketV1("(((("));
        assertFalse(testObject.matchBracketV1("))))"));
        assertFalse(testObject.matchBracketV1(null));
    }

    @Test
    void test_getNextBracketV2() {
        assertTrue(testObject.matchBracketV2("(hello)(world)(s(a(m(p)l)e)s)"));
        assertTrue(testObject.matchBracketV2(""));
        assertFalse(testObject.matchBracketV2("((hello)(world)"));
        assertTrue(testObject.matchBracketV2("hel(lo)(wor)ld"));
        assertFalse(testObject.matchBracketV2("())(()"));
        assertFalse(testObject.matchBracketV2("(((("));
        assertFalse(testObject.matchBracketV2("))))"));
        assertFalse(testObject.matchBracketV2(null));
    }
}