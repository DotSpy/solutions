package com.leetcode

class MoveZeroes {

  class Solution {

    fun moveZeroes(nums: IntArray): Unit {
      var nonZero = 0
      for (i in nums.indices) {
        if (nums[i] != 0) {
          nums[nonZero] = nums[i]
          nonZero++
          if (i > nonZero) {
            nums[i] = 0
          }
        }
      }
    }
  }
}