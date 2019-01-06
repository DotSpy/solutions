package com.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class HammingDistanceTest {

  @Test
  fun `leetcode example input`() {
    val solution = HammingDistance.Solution()
    Assertions.assertEquals(2, solution.hammingDistance(1, 4))
  }

  @Test
  fun `leetcode run input`() {
    val solution = HammingDistance.Solution()
    Assertions.assertEquals(1, solution.hammingDistance(3, 1))
  }

  @Test
  fun `leetcode run input2`() {
    val solution = HammingDistance.Solution()
    Assertions.assertEquals(2, solution.hammingDistance(93, 73))
  }

  @Test
  fun `leetcode run input3`() {
    val solution = HammingDistance.Solution()
    Assertions.assertEquals(2, solution.hammingDistance(4, 2))
  }

  @Test
  fun `leetcode run input4`() {
    val solution = HammingDistance.Solution()
    Assertions.assertEquals(1, solution.hammingDistance(0, 1))
  }
}