package com.self.datastructures.sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InBuiltSortingMethodsInJavaTest {

    private InBuiltSortingMethodsInJava inBuiltSortingMethodsInJava;

    @BeforeEach
    public void setUp(){
        inBuiltSortingMethodsInJava = new InBuiltSortingMethodsInJava();
    }

    @Test
    public void testSortArrayPrimitives(){
        assertArrayEquals(new int[]{1,2,3,4,5}, inBuiltSortingMethodsInJava.sortArrayPrimitives(new int[]{5,3,4,1,2}));
    }

    @Test
    public void testSortPartOfArrayPrimitives(){
        assertArrayEquals(new int[]{5,1,3,4,2}, inBuiltSortingMethodsInJava.sortPartOfArrayPrimitives(new int[]{5,3,4,1,2}, 1, 4));
    }

    @Test
    public void testSortArrayOfObjects(){
        assertArrayEquals(new Integer[]{1,2,3,4,5}, inBuiltSortingMethodsInJava.sortArrayOfObjects(new Integer[]{5,3,4,1,2}));
    }

    @Test
    public void testSortListOfObjects(){
        assertIterableEquals(Arrays.asList(1,2,3,4,5), inBuiltSortingMethodsInJava.sortListOfObjects(Arrays.asList(5,3,4,1,2)));
    }
}