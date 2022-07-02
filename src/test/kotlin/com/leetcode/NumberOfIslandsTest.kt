package com.leetcode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class NumberOfIslandsTest {

  private val solution = NumberOfIslands.Solution()

  @Test
  fun `leetcode example 1`() {
    val grid = arrayOf(
      charArrayOf('1', '1', '1', '1', '0'),
      charArrayOf('1', '1', '0', '1', '0'),
      charArrayOf('1', '1', '0', '0', '0'),
      charArrayOf('0', '0', '0', '0', '0')
    )
    assertEquals(1, solution.numIslands(grid))
  }

  @Test
  fun `leetcode example 2`() {
    val grid = arrayOf(
      charArrayOf('1', '1', '0', '0', '0'),
      charArrayOf('1', '1', '0', '0', '0'),
      charArrayOf('0', '0', '1', '0', '0'),
      charArrayOf('0', '0', '0', '1', '1')
    )
    assertEquals(3, solution.numIslands(grid))
  }

  @Test
  fun `leetcode example 3`() {
    val grid = arrayOf(
      charArrayOf('1', '1', '1'),
      charArrayOf('0', '1', '0'),
      charArrayOf('1', '1', '1')
    )
    assertEquals(1, solution.numIslands(grid))
  }
}
