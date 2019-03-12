package com.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class BestTimeToBuyAndSellStockTest {

  @Test
  fun `leetcode example 1`() {
    Assertions.assertEquals(5, BestTimeToBuyAndSellStock.Solution().maxProfit(intArrayOf(7, 1, 5, 3, 6, 4)))
  }

  @Test
  fun `leetcode example 2`() {
    Assertions.assertEquals(0, BestTimeToBuyAndSellStock.Solution().maxProfit(intArrayOf(7, 6, 4, 3, 1)))
  }
}