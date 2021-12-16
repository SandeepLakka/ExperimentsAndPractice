
package com.self.practice.arrays;

import static org.junit.jupiter.api.Assertions.*;

//import com.sun.javaws.exceptions.InvalidArgumentException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrayReverseTest {

    private ArrayReverse arrayReverse;

    @BeforeEach
    public void init() {
        arrayReverse = new ArrayReverse();
    }

    @Test
    public void test_naiveSolution() /*throws InvalidArgumentException*/ {
        assertEquals(arrayReverse.naiveSolution("hello"), "olleh");
        assertEquals(arrayReverse.naiveSolution("world"), "dlrow");
        assertEquals(arrayReverse.naiveSolution(""), "");
        assertThrows(IllegalArgumentException.class, () -> arrayReverse.naiveSolution(null));
    }

    @Test
    public void test_stringBuilderSolution() /*throws InvalidArgumentException*/ {
        assertEquals(arrayReverse.naiveSolution("hello"), "olleh");
        assertEquals(arrayReverse.naiveSolution("world"), "dlrow");
        assertEquals(arrayReverse.naiveSolution(""), "");
        assertThrows(IllegalArgumentException.class, () -> arrayReverse.naiveSolution(null));
    }


}
