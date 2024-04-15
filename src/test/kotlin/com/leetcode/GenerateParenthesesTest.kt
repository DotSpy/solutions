package com.leetcode

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class GenerateParenthesesTest {

    @Test
    fun leetCodeExample1() {
        val solution = GenerateParentheses.Solution()
        val result = solution.generateParenthesis(3)
        val expected = listOf("((()))", "(()())", "(())()", "()(())", "()()()")
        assertTrue(
            result.size == expected.size && result.containsAll(expected) && expected.containsAll(result)
        )
    }

    @Test
    fun leetCodeExample2() {
        val solution = GenerateParentheses.Solution()
        val result = solution.generateParenthesis(1)
        val expected = listOf("()")
        assertTrue(
            result.size == expected.size && result.containsAll(expected) && expected.containsAll(result)
        )
    }

    @Test
    fun leetCodeExample3() {
        val solution = GenerateParentheses.Solution()
        val result = solution.generateParenthesis(2)
        val expected = listOf("()()", "(())")
        assertTrue(
            result.size == expected.size && result.containsAll(expected) && expected.containsAll(result)
        )
    }
}