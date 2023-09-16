package com.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestCommonPrefixTest {

    private val solution = LongestCommonPrefix.Solution()

    @Test
    fun `leetcode example test`() {
        assertEquals("fl", solution.longestCommonPrefix(arrayOf("flower", "flow", "flight")))
    }

    @Test
    fun `leetcode example test2`() {
        assertEquals("", solution.longestCommonPrefix(arrayOf("dog", "racecar", "car")))
    }

    @Test
    fun `leetcode example test3`() {
        assertEquals("dog", solution.longestCommonPrefix(arrayOf("dog")))
    }

    @Test
    fun `leetcode example test4`() {
        assertEquals("", solution.longestCommonPrefix(arrayOf("")))
    }

    @Test
    fun `leetcode example test5`() {
        assertEquals("a", solution.longestCommonPrefix(arrayOf("ab", "a")))
    }
}