package com.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ContainerWithMostWaterTest {

  private val solution = ContainerWithMostWater.Solution()

  @Test
  fun leetCodeExample1() {
    assertEquals(49, solution.maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)))
  }

  @Test
  fun leetCodeExample2() {
    assertEquals(1, solution.maxArea(intArrayOf(1, 1)))
  }
}
