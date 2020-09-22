package com.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class PartitionLabelsTest {

  private val solution = PartitionLabels.Solution()

  @Test
  fun `leetcode example 1`() {
    Assertions.assertEquals(listOf(9, 7, 8), solution.partitionLabels("ababcbacadefegdehijhklij"))
  }

  @Test
  fun `corner cases`() {
    Assertions.assertEquals(listOf(1), solution.partitionLabels("a"))
    Assertions.assertEquals(listOf(1,1), solution.partitionLabels("ab"))
    Assertions.assertEquals(listOf(3), solution.partitionLabels("aba"))
  }
}