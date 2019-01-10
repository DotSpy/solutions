package com.leetcode


class FindAllNumbersDisappearedInAnArray {

  class Solution {

    fun findDisappearedNumbers(nums: IntArray): List<Int> {
      val result = mutableListOf<Int>()
      for (num in nums) {
        val absIndex = Math.abs(num) - 1
        if (nums[absIndex] > 0) {
          nums[absIndex] = -nums[absIndex]
        }
      }
      for (i in nums.indices) {
        if (nums[i] > 0) {
          result.add(i + 1)
        }
      }
      return result
    }
  }
}