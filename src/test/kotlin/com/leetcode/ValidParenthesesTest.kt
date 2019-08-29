package com.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class ValidParenthesesTest {

    private val solution = ValidParentheses.Solution()

    @Test
    fun `leetcode 1 example test`() = Assertions.assertEquals(true, solution.isValid("()"))

    @Test
    fun `leetcode 2 example test`() = Assertions.assertEquals(true, solution.isValid("()[]{}"))

    @Test
    fun `leetcode 3 example test`() = Assertions.assertEquals(false, solution.isValid("(]"))

    @Test
    fun `leetcode 4 example test`() = Assertions.assertEquals(false, solution.isValid("([)]"))
}