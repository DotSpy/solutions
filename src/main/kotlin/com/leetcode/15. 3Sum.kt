package com.leetcode

/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.



Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]

Example 2:

Input: nums = []
Output: []

Example 3:

Input: nums = [0]
Output: []



Constraints:

    0 <= nums.length <= 3000
    -105 <= nums[i] <= 105

 */
class Sum3 {
  class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
      if (nums.size < 3) {
        return emptyList()
      }
      nums.sort()
      val result = mutableSetOf<List<Int>>()
      for (i in 0..nums.lastIndex - 2) {
        var j = i + 1
        var k = nums.lastIndex
        while (j < k) {
          val sum = nums[i] + nums[j] + nums[k]
          if (sum == 0) {
            result.add(listOf(nums[i], nums[j], nums[k]))
            j++
            k--
          } else if (sum > 0) {
            k--
          } else {
            j++
          }
        }
      }
      return result.toList()
    }
  }
}
