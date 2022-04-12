package com.leetcode

/*
Given an m x n binary matrix filled with 0's and 1's, find the largest square containing only 1's and
return its area.

Example 1:

Input: matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
Output: 4

Input: matrix = [["0","1"],["1","0"]]
Output: 1

Example 3:

Input: matrix = [["0"]]
Output: 0

 */
class `221 Maximal Square` {
  class Solution {

    fun maximalSquare(matrix: Array<CharArray>): Int {
      val dp = Array(matrix.size + 1) { IntArray(matrix.first().size + 1) { 0 } }
      var max = 0
      for (i in 0..matrix.lastIndex) {
        for (j in 0..matrix[0].lastIndex) {
          if (matrix[i][j] == '1') {
            dp[i + 1][j + 1] = minOf(dp[i][j], dp[i + 1][j], dp[i][j + 1]) + 1
            max = maxOf(max, dp[i + 1][j + 1])
          }
        }
      }
      return max * max
    }
  }
}
