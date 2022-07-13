package com.leetcode

class WordBreak {
  class Solution {
    fun wordBreak(s: String, dict: List<String>): Boolean {
      val dp = Array(s.length + 1) { false }
      dp[0] = true
      for (i in 0..s.lastIndex) {
        for (w in dict) {
          if (dp[i] && s.lastIndex >= i + w.length - 1 && s.substring(i, i + w.length) == w) {
            dp[i + w.length] = true
          }
        }
      }
      return dp[dp.lastIndex]
    }
  }
}
