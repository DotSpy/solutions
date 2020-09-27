package com.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class QueueReconstructionByHeightTest {

  private val solution = QueueReconstructionByHeight.Solution()

  @Test
  fun `leetcode example 1`() {
    Assertions.assertArrayEquals(
      arrayOf(
        intArrayOf(5, 0),
        intArrayOf(7, 0),
        intArrayOf(5, 2),
        intArrayOf(6, 1),
        intArrayOf(4, 4),
        intArrayOf(7, 1)
      ), solution.reconstructQueue(
        arrayOf(
          intArrayOf(7, 0),
          intArrayOf(4, 4),
          intArrayOf(7, 1),
          intArrayOf(5, 0),
          intArrayOf(6, 1),
          intArrayOf(5, 2)
        )
      )
    )
  }
}