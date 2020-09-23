package com.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class MergeIntervalsTest {

  private val solution = MergeIntervals.Solution()

  @Test
  fun `leetcode example 1`() {
    Assertions.assertArrayEquals(
      arrayOf(intArrayOf(1, 6), intArrayOf(8, 10), intArrayOf(15, 18)),
      solution.merge(arrayOf(intArrayOf(1, 3), intArrayOf(2, 6), intArrayOf(8, 10), intArrayOf(15, 18)))
    )
  }

  @Test
  fun `leetcode example 2`() {
    Assertions.assertArrayEquals(
      arrayOf(intArrayOf(1, 5)),
      solution.merge(arrayOf(intArrayOf(1, 4), intArrayOf(4, 5)))
    )
  }

  @Test
  fun `leetcode example 3`() {
    Assertions.assertArrayEquals(
      emptyArray(),
      solution.merge(arrayOf())
    )
  }

  @Test
  fun `leetcode example 4`() {
    Assertions.assertArrayEquals(
      arrayOf(intArrayOf(0, 4)),
      solution.merge(arrayOf(intArrayOf(1, 4), intArrayOf(0, 4)))
    )
  }

  @Test
  fun `leetcode example 5`() {
    Assertions.assertArrayEquals(
      arrayOf(intArrayOf(0, 0), intArrayOf(1, 4)),
      solution.merge(arrayOf(intArrayOf(1, 4), intArrayOf(0, 0)))
    )
  }
}