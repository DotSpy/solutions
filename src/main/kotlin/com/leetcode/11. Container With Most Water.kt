package com.leetcode

import kotlin.math.max
import kotlin.math.min

class ContainerWithMostWater {
  class Solution {
    fun maxArea(height: IntArray): Int {
      var leftPointer = 0
      var rightPointer = height.lastIndex
      var result = -1
      while (leftPointer != rightPointer) {
        result = max(result, min(height[rightPointer], height[leftPointer]) * (rightPointer - leftPointer))
        if (height[rightPointer] > height[leftPointer]) {
          leftPointer++
        } else {
          rightPointer--
        }
      }
      return result
    }
  }
}
