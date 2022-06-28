package com.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

internal class RomanToIntegerTest {

  private val solution = RomanToInteger.Solution()

  @ParameterizedTest
  @CsvSource("III,3", "LVIII,58", "MCMXCIV,1994", "IV,4")
  fun `leetcodeExample`(input: String, expected: Int) {
    Assertions.assertEquals(expected, solution.romanToInt(input))
  }
}
