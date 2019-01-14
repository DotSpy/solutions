package com.leetcode

class TwoSum {

  class Solution {

    fun twoSum(nums: IntArray, target: Int): IntArray {
      val numberToIndexMap = mutableMapOf<Int, Int>()
      for (i in nums.indices) {
        val numberToReachTarget = target - nums[i]
        if (numberToIndexMap.contains(numberToReachTarget)) {
          return intArrayOf(numberToIndexMap[numberToReachTarget]
              ?: throw IllegalStateException("No index for number = $numberToIndexMap"), i)
        }
        numberToIndexMap[nums[i]] = i
      }
      throw IllegalStateException("No feasible solution for input = $nums , $target")
    }
  }
}