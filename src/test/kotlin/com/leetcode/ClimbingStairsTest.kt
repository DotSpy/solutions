package com.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class ClimbingStairsTest {

  lateinit var solution: ClimbingStairs.Solution

  @BeforeEach
  fun setUp() {
    solution = ClimbingStairs.Solution()
  }

  @Test
  fun `1 stair test`() {
    Assertions.assertEquals(1, solution.climbStairs(1))
  }

  @Test
  fun `2 stair test`() {
    Assertions.assertEquals(2, solution.climbStairs(2))
  }

  @Test
  fun `3 stair test`() {
    Assertions.assertEquals(3, solution.climbStairs(3))
  }

  @Test
  fun `4 stair test`() {
    Assertions.assertEquals(8, solution.climbStairs(5))
  }
}