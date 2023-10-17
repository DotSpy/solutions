package com.leetcode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LetterCombinationsOfAPhoneNumberTest {

    private val solution = LetterCombinationsOfAPhoneNumber.Solution()

    @Test
    fun leetCodeExample() {
        val digits = "23"
        assertArrayEquals(
                listOf("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf").toTypedArray(),
                solution.letterCombinations(digits).toTypedArray()
        )
    }

    @Test
    fun leetCodeExample2() {
        val digits = ""
        assertEquals(
                0,
                solution.letterCombinations(digits).toTypedArray().size
        )
    }

    @Test
    fun leetCodeExample3() {
        val digits = "2"
        assertArrayEquals(
                listOf("a", "b", "c").toTypedArray(),
                solution.letterCombinations(digits).toTypedArray()
        )
    }
}