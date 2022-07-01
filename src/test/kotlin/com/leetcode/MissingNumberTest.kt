package com.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class MissingNumberTest {

  private val solution = MissingNumber.Solution()

  @Test
  fun `leetcode example 1`() {
    assertEquals(2, solution.missingNumber(intArrayOf(3, 0, 1)))
  }

  @Test
  fun `leetcode example 2`() {
    assertEquals(2, solution.missingNumber(intArrayOf(0, 1)))
  }

  @Test
  fun `leetcode example 3`() {
    assertEquals(8, solution.missingNumber(intArrayOf(9, 6, 4, 2, 3, 5, 7, 0, 1)))
  }

  @Test
  fun `leetcode example 4`() {
    assertEquals(1, solution.missingNumber(intArrayOf(0, 2)))
  }
}
