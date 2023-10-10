package com.leetcode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LongestSubstringWithoutRepeatingCharactersTest {

    private val solution = LongestSubstringWithoutRepeatingCharacters.Solution()

    @Test
    fun leetcodeExample1() {
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"))
    }

    @Test
    fun leetcodeExample2() {
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"))
    }

    @Test
    fun leetcodeExample3() {
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"))
    }

    @Test
    fun leetcodeExample4() {
        assertEquals(1, solution.lengthOfLongestSubstring(" "))
    }

    @Test
    fun leetcodeExample5() {
        assertEquals(3, solution.lengthOfLongestSubstring("abc"))
    }

    @Test
    fun leetcodeExample7() {
        assertEquals(2, solution.lengthOfLongestSubstring("abb"))
    }
}