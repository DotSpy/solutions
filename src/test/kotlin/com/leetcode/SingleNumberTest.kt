package com.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class SingleNumberTest {

  @Test
  fun `leetcode test`() {
    val solution = SingleNumber.Solution()
    Assertions.assertEquals(4, solution.singleNumber(intArrayOf(4, 1, 2, 1, 2)))
  }
}