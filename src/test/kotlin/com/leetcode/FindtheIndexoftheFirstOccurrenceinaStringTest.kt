package com.leetcode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FindtheIndexoftheFirstOccurrenceinaStringTest {

    private val solution = FindtheIndexoftheFirstOccurrenceinaString.Solution()

    @Test
    fun leetCodeExample1() {
        assertEquals(0, solution.strStr("sadbutsad", "sad"))
    }

    @Test
    fun leetCodeExample2() {
        assertEquals(-1, solution.strStr("leetcode", "leeto"))
    }

    @Test
    fun leetCodeExample3() {
        assertEquals(1, solution.strStr("ssad", "sad"))
    }

    @Test
    fun leetCodeExample4() {
        assertEquals(-1, solution.strStr("aaa", "aaaa"))
    }

    @Test
    fun leetCodeExample5() {
        assertEquals(-1, solution.strStr("mississippi", "issipi"))
    }
}