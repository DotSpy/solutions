package com.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class CountingBitsTest {

  private val solution = CountingBits.Solution()

  @Test
  fun `leetcode example 1`() {
    Assertions.assertArrayEquals(intArrayOf(0, 1, 1), solution.countBits(2))
  }

  @Test
  fun `leetcode example 2`() {
    Assertions.assertArrayEquals(intArrayOf(0,1,1,2,1,2), solution.countBits(5))
  }
}