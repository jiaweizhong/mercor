package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    int[] testArr = { 2, 3, 4, 10, 40 };
    int[] testEmpty = {};
    int[] testLarge = new int[Integer.MAX_VALUE-3];

    @Test
    void demoTestRegular1() {
        assertEquals(3, BinarySearch.binarySearch(testArr, 10));
    }

    @Test
    void demoTestRegular2() {
        assertEquals(-1, BinarySearch.binarySearch(testArr, 11));
    }

    @Test
    void demoTestEmpty() {
        assertEquals(-1, BinarySearch.binarySearch(testEmpty, 11));
    }

    @Test
    void demoTestLargeArrayIndexOutOfBounds() {
        assertEquals(-1, BinarySearch.binarySearch(testLarge, 11));
    }
}