package com.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class KidsWithTheGreatestNumberOfCandiesTest {

  private val solution = KidsWithTheGreatestNumberOfCandies.Solution()

  @Test
  fun `leetcode example test 1`() {
    Assertions.assertArrayEquals(
      booleanArrayOf(true, true, true, false, true),
      solution.kidsWithCandies(intArrayOf(2, 3, 5, 1, 3), 3)
    )
  }

  @Test
  fun `leetcode example test 2`() {
    Assertions.assertArrayEquals(
      booleanArrayOf(true, false, false, false, false),
      solution.kidsWithCandies(intArrayOf(4, 2, 1, 1, 2), 1)
    )
  }

  @Test
  fun `leetcode example test 3`() {
    Assertions.assertArrayEquals(
      booleanArrayOf(true,false,true),
      solution.kidsWithCandies(intArrayOf(12,1,12), 10)
    )
  }
}