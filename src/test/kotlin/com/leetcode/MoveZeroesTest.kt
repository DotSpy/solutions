package com.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class MoveZeroesTest {

  @Test
  fun `leetcode example input`() {
    val solution = MoveZeroes.Solution()
    val array = intArrayOf(0, 1, 0, 3, 12)
    solution.moveZeroes(array)
    Assertions.assertArrayEquals(intArrayOf(1, 3, 12, 0, 0), array)
  }

  @Test
  fun `leetcode example runtime input1`() {
    val solution = MoveZeroes.Solution()
    val array = intArrayOf(0)
    solution.moveZeroes(array)
    Assertions.assertArrayEquals(intArrayOf(0), array)
  }

  @Test
  fun `leetcode example runtime input2`() {
    val solution = MoveZeroes.Solution()
    val array = intArrayOf(0, 0, 1)
    solution.moveZeroes(array)
    Assertions.assertArrayEquals(intArrayOf(1, 0, 0), array)
  }
}