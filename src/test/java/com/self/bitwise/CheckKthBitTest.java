package com.self.bitwise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckKthBitTest {

    @Test
    public void testIsKthBitSet(){
        CheckKthBit checkKthBit = new CheckKthBit();
        assertTrue(checkKthBit.isKthBitSet(5,1));
        assertFalse(checkKthBit.isKthBitSet(8,2));
        assertFalse(checkKthBit.isKthBitSet(0,3));
    }
}