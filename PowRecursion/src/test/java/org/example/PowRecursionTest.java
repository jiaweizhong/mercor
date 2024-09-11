package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowRecursionTest {

    @Test
    void demoTestRegular1() {
        assertEquals(25, PowRecursion.power(5, 2));
    }

    @Test
    void demoTestRegular2() {
        assertEquals(32, PowRecursion.power(2, 5));
    }

    @Test
    void demoTestCorner1() {
        assertEquals(1, PowRecursion.power(1, 0));
    }

    @Test
    void demoTestCorner2() {
        assertEquals(0, PowRecursion.power(0, 1));
    }

    @Test
    void demoTestCorner3() {
        assertEquals(1, PowRecursion.power(0, 0));
    }

    @Test
    void demoTestLargePower1() {
        assertEquals(1, PowRecursion.power(1, 40000));
    }

    @Test
    void demoTestLargePower2() {
        assertEquals(0, PowRecursion.power(0, 40000));
    }

}