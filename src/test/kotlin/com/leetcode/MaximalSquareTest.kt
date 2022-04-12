package com.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class MaximalSquareTest {

  private val solution = `221 Maximal Square`.Solution()

  @Test
  fun `leetcode example 1`() {
    val matrix = arrayOf(
      charArrayOf('1', '0', '1', '0', '0'),
      charArrayOf('1', '0', '1', '1', '1'),
      charArrayOf('1', '1', '1', '1', '1'),
      charArrayOf('1', '0', '0', '1', '0')
    )
    Assertions.assertEquals(4, solution.maximalSquare(matrix))
  }

  @Test
  fun `leetcode example 3`() {
    val matrix = arrayOf(
      charArrayOf('0')
    )
    Assertions.assertEquals(0, solution.maximalSquare(matrix))
  }

  @Test
  fun `leetcode example 2`() {
    val matrix = arrayOf(
      charArrayOf('0', '1'),
      charArrayOf('1', '0'),
    )
    Assertions.assertEquals(1, solution.maximalSquare(matrix))
  }

  @Test
  fun `leetcode example 4`() {
    val matrix = arrayOf(
      charArrayOf('0', '1'),
    )
    Assertions.assertEquals(1, solution.maximalSquare(matrix))
  }

  @Test
  fun `leetcode example 5`() {
    val matrix = arrayOf(
      charArrayOf('0'),
      charArrayOf('1'),
    )
    Assertions.assertEquals(1, solution.maximalSquare(matrix))
  }

  @Test
  fun `leetcode example 6`() {
    val matrix = arrayOf(
      charArrayOf('1', '1', '1', '1', '1', '1', '1', '1'),
      charArrayOf('1', '1', '1', '1', '1', '1', '1', '0'),
      charArrayOf('1', '1', '1', '1', '1', '1', '1', '0'),
      charArrayOf('1', '1', '1', '1', '1', '0', '0', '0'),
      charArrayOf('0', '1', '1', '1', '1', '0', '0', '0')
    )
    Assertions.assertEquals(16, solution.maximalSquare(matrix))
  }
}
