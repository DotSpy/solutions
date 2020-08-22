package com.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class RunningSumOf1dArrayTest {

  private val solution = RunningSumOf1dArray.Solution()

  @Test
  fun `leetcode example test 1`() {
    Assertions.assertArrayEquals(intArrayOf(1, 3, 6, 10), solution.runningSum(intArrayOf(1, 2, 3, 4)))
  }

  @Test
  fun `leetcode example test 2`() {
    Assertions.assertArrayEquals(intArrayOf(1, 2, 3, 4, 5), solution.runningSum(intArrayOf(1, 1, 1, 1, 1)))
  }

  @Test
  fun `leetcode example test 3`() {
    Assertions.assertArrayEquals(intArrayOf(3, 4, 6, 16, 17), solution.runningSum(intArrayOf(3, 1, 2, 10, 1)))
  }

  @Test
  fun `1 element array`() {
    Assertions.assertArrayEquals(intArrayOf(1), solution.runningSum(intArrayOf(1)))
  }
}