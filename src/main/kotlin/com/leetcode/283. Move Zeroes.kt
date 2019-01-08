package com.leetcode

class MoveZeroes {

  class Solution {

    fun moveZeroes(nums: IntArray): Unit {
      var zeroesFound = 0
      for (i in nums.indices) {
        if (nums.size - zeroesFound <= i) {
          break
        }
        if (nums[i + zeroesFound] == 0) {
          zeroesFound++
          var zero = true
          while (zero) {
            if (i + zeroesFound < nums.size && nums[i + zeroesFound] == 0 ) {
              zeroesFound++
            } else {
              zero = false
            }
          }
        }
        if (zeroesFound > 0 && i + zeroesFound < nums.size) {
          nums[i] = nums[i + zeroesFound]
        }
      }
      for (z in nums.size - 1 downTo nums.size - zeroesFound) {
        nums[z] = 0
      }
    }
  }
}