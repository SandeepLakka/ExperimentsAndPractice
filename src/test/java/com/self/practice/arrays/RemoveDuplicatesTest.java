package com.self.practice.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicates(){
        RemoveDuplicates duplicates = new RemoveDuplicates();
        assertEquals(3, duplicates.removeDuplicates(new int[]{10,20,20,30,30,30}));
        assertEquals(1, duplicates.removeDuplicates(new int[]{10,10,10}));
    }
}