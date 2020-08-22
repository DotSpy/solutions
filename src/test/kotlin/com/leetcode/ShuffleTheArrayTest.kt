package com.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class ShuffleTheArrayTest {

  private val solution = ShuffleTheArray.Solution()

  @Test
  fun `leetcode example 1`() {
    Assertions.assertArrayEquals(intArrayOf(2, 3, 5, 4, 1, 7), solution.shuffle(intArrayOf(2, 5, 1, 3, 4, 7), 3))
  }

  @Test
  fun `leetcode example 2`() {
    Assertions.assertArrayEquals(
      intArrayOf(1, 4, 2, 3, 3, 2, 4, 1),
      solution.shuffle(intArrayOf(1, 2, 3, 4, 4, 3, 2, 1), 4)
    )
  }

  @Test
  fun `leetcode example 3`() {
    Assertions.assertArrayEquals(intArrayOf(1, 2, 1, 2), solution.shuffle(intArrayOf(1, 1, 2, 2), 2))
  }
}