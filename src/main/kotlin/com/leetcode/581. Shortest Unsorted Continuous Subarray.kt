package com.leetcode

/*
Given an integer array, you need to find one continuous subarray that if you only sort this subarray in ascending order,
 then the whole array will be sorted in ascending order, too.

You need to find the shortest such subarray and output its length.

Example 1:

Input: [2, 6, 4, 8, 10, 9, 15]
Output: 5
Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.

Note:

    Then length of the input array is in range [1, 10,000].
    The input array may contain duplicates, so ascending order here means <=.

 */
class ShortestUnsortedContinuousSubarray {
  class Solution {

    fun findUnsortedSubarray(nums: IntArray): Int {
      var min = Integer.MAX_VALUE
      var max = Integer.MIN_VALUE
      var isOrderBroken = false
      for (i in 1 until nums.size) {
        if (nums[i] < nums[i - 1]) {
          isOrderBroken = true
        }
        if (isOrderBroken && min > nums[i]) {
          min = nums[i]
        }
      }
      isOrderBroken = false
      for (i in nums.lastIndex - 1 downTo 0) {
        if (nums[i] > nums[i + 1]) {
          isOrderBroken = true
        }
        if (isOrderBroken && max < nums[i]) {
          max = nums[i]
        }
      }
      var leftPlace = 0
      for (i in 0 until nums.lastIndex) {
        if (min < nums[i]) {
          leftPlace = i
          break
        }
      }
      var rightPlace = 0
      for (i in nums.lastIndex downTo 1) {
        if (max > nums[i]) {
          rightPlace = i
          break
        }
      }
      return if (rightPlace - leftPlace > 0) {
        rightPlace - leftPlace + 1
      } else {
        0
      }
    }
  }
}