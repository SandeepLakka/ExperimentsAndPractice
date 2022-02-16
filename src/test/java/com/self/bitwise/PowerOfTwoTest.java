package com.self.bitwise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfTwoTest {

    @Test
    public void testIsPowerOf2(){
        PowerOfTwo power = new PowerOfTwo();
        assertTrue(power.isPowerOf2(8));
        assertFalse(power.isPowerOf2(7));
    }

    @Test
    public void testIsPowerOf22(){
        PowerOfTwo power = new PowerOfTwo();
        assertTrue(power.isPowerOf22(8));
        assertFalse(power.isPowerOf22(7));
    }
}