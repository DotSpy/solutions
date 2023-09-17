package com.leetcode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PascalsTriangleTest {

    private val solution = PascalsTriangle.Solution()

    @Test
    fun leetCodeExample() {
        assertEquals(
                listOf(
                        listOf(1),
                        listOf(1, 1),
                        listOf(1, 2, 1),
                        listOf(1, 3, 3, 1),
                        listOf(1, 4, 6, 4, 1)
                ),
                solution.generate(5)
        )
    }
}