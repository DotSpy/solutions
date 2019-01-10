package com.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class FindAllNumbersDisappearedInAnArrayTest {

  @Test
  fun `leetcode test case`() {
    val solution = FindAllNumbersDisappearedInAnArray.Solution()
    Assertions.assertEquals(intArrayOf(5, 6).toList(), solution.findDisappearedNumbers(intArrayOf(4, 3, 2, 7, 8, 2, 3, 1)))
  }
}