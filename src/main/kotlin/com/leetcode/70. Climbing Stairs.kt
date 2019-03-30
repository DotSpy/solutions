package com.leetcode

class ClimbingStairs {

  class Solution {

    private val calculatedSteps = hashMapOf<Int, Int>()

    fun climbStairs(n: Int): Int =
      if (n <= 3) {
        n
      } else {
        var first = calculatedSteps[n - 1]
        if (first == null) {
          calculatedSteps[n - 1] = climbStairs(n - 1)
          first = calculatedSteps[n - 1]
        }
        var second = calculatedSteps[n - 2]
        if (second == null) {
          calculatedSteps[n - 2] = climbStairs(n - 2)
          second = calculatedSteps[n - 2]
        }
        first!! + second!!
      }
  }
}