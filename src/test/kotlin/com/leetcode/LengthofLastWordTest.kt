package com.leetcode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LengthofLastWordTest {

    private val solution = LengthofLastWord.Solution()

    @Test
    fun leetcodeExample1() {
        assertEquals(5, solution.lengthOfLastWord("Hello World"))
    }

    @Test
    fun leetcodeExample2() {
        assertEquals(4, solution.lengthOfLastWord("   fly me   to   the moon  "))
    }

    @Test
    fun leetcodeExample3() {
        assertEquals(6, solution.lengthOfLastWord("luffy is still joyboy"))
    }

    @Test
    fun leetcodeExample4() {
        assertEquals(1, solution.lengthOfLastWord("a"))
        assertEquals(1, solution.lengthOfLastWord(" a"))
        assertEquals(1, solution.lengthOfLastWord(" a "))
        assertEquals(1, solution.lengthOfLastWord("a "))
    }
}