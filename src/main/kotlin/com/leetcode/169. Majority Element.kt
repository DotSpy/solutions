package com.leetcode

class MajorityEment {

  class Solution {

    fun majorityElement(nums: IntArray): Int {
      val resultMap = mutableMapOf<Int, Int>()
      var maxQuantity = Integer.MIN_VALUE
      var majorElement = nums[0]
      nums.forEach { num ->
        if (resultMap.contains(num)) {
          var elementQuantity = resultMap[num] ?: throw IllegalStateException("Count should not be 0 for $num")
          resultMap[num] = ++elementQuantity
          if (maxQuantity < elementQuantity) {
            maxQuantity = elementQuantity
            majorElement = num
          }
        } else {
          resultMap[num] = 1
        }
      }
      return majorElement
    }
  }
}