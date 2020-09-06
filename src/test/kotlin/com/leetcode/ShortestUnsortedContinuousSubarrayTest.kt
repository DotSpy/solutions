package com.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class ShortestUnsortedContinuousSubarrayTest {

  private val solution = ShortestUnsortedContinuousSubarray.Solution()

  @Test
  fun `leetcode example 1`() {
    Assertions.assertEquals(5, solution.findUnsortedSubarray(intArrayOf(2, 6, 4, 8, 10, 9, 15)))
  }

  @Test
  fun `array of size 1 should return 0`() {
    Assertions.assertEquals(0, solution.findUnsortedSubarray(intArrayOf(1)))
  }

  @Test
  fun `leetcode example 2`() {
    Assertions.assertEquals(0, solution.findUnsortedSubarray(intArrayOf(1, 2, 3, 4)))
  }

  @Test
  fun `leetcode example 3`() {
    Assertions.assertEquals(2, solution.findUnsortedSubarray(intArrayOf(1, 3, 2, 4, 5)))
  }

  @Test
  fun `leetcode example 4`() {
    Assertions.assertEquals(2, solution.findUnsortedSubarray(intArrayOf(2, 1)))
  }

  @Test
  fun `leetcode example 5`() {
    Assertions.assertEquals(4, solution.findUnsortedSubarray(intArrayOf(1, 3, 2, 2, 2)))
  }

  @Test
  fun `leetcode example 6`() {
    Assertions.assertEquals(0, solution.findUnsortedSubarray(intArrayOf(1, 2, 3, 3, 3)))
  }

  @Test
  fun `leetcode example 7`() {
    Assertions.assertEquals(2, solution.findUnsortedSubarray(intArrayOf(1, 2, 3, 5, 4)))
  }

  @Test
  fun `leetcode example 8`() {
    Assertions.assertEquals(3, solution.findUnsortedSubarray(intArrayOf(1, 2, 4, 5, 3)))
  }

  @Test
  fun `leetcode example 9`() {
    Assertions.assertEquals(3, solution.findUnsortedSubarray(intArrayOf(1, 2, 5, 3, 4)))
  }
}