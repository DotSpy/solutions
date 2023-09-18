package com.leetcode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class BinarySearchTest {

    private val solution = BinarySearch.Solution()

    @Test
    fun leetcodeExample() {
        assertEquals(4, solution.search(intArrayOf(-1, 0, 3, 5, 9, 12), 9))
    }

    @Test
    fun leetcodeExample2() {
        assertEquals(-1, solution.search(intArrayOf(-1, 0, 3, 5, 9, 12), 2))
    }

    @Test
    fun leetcodeExample3() {
        assertEquals(1, solution.search(intArrayOf(2, 5), 5))
    }

    @Test
    fun leetcodeExample4() {
        assertEquals(0, solution.search(intArrayOf(2, 5), 2))
    }
}