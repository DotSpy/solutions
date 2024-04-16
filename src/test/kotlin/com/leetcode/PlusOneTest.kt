package com.leetcode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PlusOneTest {

    @Test
    fun leetCodeExample1() {
        val solution = PlusOne.Solution()
        val digits = intArrayOf(1, 2, 3)
        val result = solution.plusOne(digits)
        assertArrayEquals(intArrayOf(1, 2, 4), result)
    }

    @Test
    fun leetCodeExample2() {
        val solution = PlusOne.Solution()
        val digits = intArrayOf(9, 9)
        val result = solution.plusOne(digits)
        assertArrayEquals(intArrayOf(1, 0, 0), result)
    }

    @Test
    fun leetCodeExample3() {
        val solution = PlusOne.Solution()
        val digits = intArrayOf(4, 3, 2, 1)
        val result = solution.plusOne(digits)
        assertArrayEquals(intArrayOf(4, 3, 2, 2), result)
    }

    @Test
    fun leetCodeExample4() {
        val solution = PlusOne.Solution()
        val digits = intArrayOf(1, 1, 9)
        val result = solution.plusOne(digits)
        assertArrayEquals(intArrayOf(1, 2, 0), result)
    }
}