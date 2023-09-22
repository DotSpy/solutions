package com.leetcode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PermutationsTest {

    private val solution = Permutations.Solution()

    @Test
    fun leetCodeExample1() {
        val expected = listOf(
                listOf(1, 2, 3),
                listOf(1, 3, 2),
                listOf(2, 1, 3),
                listOf(2, 3, 1),
                listOf(3, 1, 2),
                listOf(3, 2, 1)
        )
        val result = solution.permute(intArrayOf(1, 2, 3))
        assertEquals(expected.size, result.size)
        expected.forEach { exp ->
            assertTrue(result.contains(exp))
        }
    }

    @Test
    fun leetCodeExample2() {
        val expected = listOf(
                listOf(0, 1),
                listOf(1, 0),
        )
        val result = solution.permute(intArrayOf(0, 1))
        assertEquals(expected.size, result.size)
        expected.forEach { exp ->
            assertTrue(result.contains(exp))
        }
    }

    @Test
    fun leetCodeExample3() {
        val expected = listOf(
                listOf(0)
        )
        val result = solution.permute(intArrayOf(0))
        assertEquals(expected.size, result.size)
        expected.forEach { exp ->
            assertTrue(result.contains(exp))
        }
    }
}