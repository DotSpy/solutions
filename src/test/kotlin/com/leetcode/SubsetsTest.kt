package com.leetcode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SubsetsTest {

    private val solution = Subsets.Solution()

    @Test
    fun leetcodeExample1() {
        val expected = listOf(
                listOf(0),
                listOf(),
        )
        val result = solution.subsets(intArrayOf(0))
        assertEquals(expected.size, result.size)
        expected.forEach { exp ->
            assertTrue(result.contains(exp))
        }
    }

    @Test
    fun leetcodeExample2() {
        val expected = listOf(
                listOf(),
                listOf(1),
                listOf(2),
                listOf(1, 2),
                listOf(3),
                listOf(1, 3),
                listOf(2, 3),
                listOf(1, 2, 3)
        )
        val result = solution.subsets(intArrayOf(1, 2, 3))
        assertEquals(expected.size, result.size)
        expected.forEach { exp ->
            assertTrue(result.contains(exp))
        }
    }
}