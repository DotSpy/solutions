package com.leetcode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Sum3Test {

  private val solution = Sum3.Solution()

  @Test
  fun `leetcode example 1`() {
    assertEquals(listOf(listOf(-1, -1, 2), listOf(-1, 0, 1)), solution.threeSum(intArrayOf(-1, 0, 1, 2, -1, -4)))
  }
}
