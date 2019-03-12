package com.leetcode

class BestTimeToBuyAndSellStock {

  class Solution {

    fun maxProfit(prices: IntArray): Int {
      var profit = 0
      var min = Integer.MAX_VALUE
      for (i in prices.indices) {
        if (prices[i] < min) {
          min = prices[i]
        } else if (prices[i] - min > profit) {
          profit = prices[i] - min
        }
      }
      return profit
    }
  }
}
