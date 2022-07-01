package com.leetcode

class MissingNumber {
  class Solution {
    fun missingNumber(nums: IntArray): Int {
      var sum = (0 + nums.lastIndex + 1) * (nums.size + 1) / 2
      nums.forEach { n ->
        sum -= n
      }
      return sum
    }
  }
}
