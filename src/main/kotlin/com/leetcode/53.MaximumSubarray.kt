package com.leetcode

class MaximumSubarray {

    class Solution {

        fun maxSubArray(nums: IntArray): Int {
            var max = Int.MIN_VALUE
            var subSum = 0
            nums.forEach { num ->
                if (subSum < 0) {
                    subSum = num
                } else {
                    subSum += num
                }
                if (max < subSum) {
                    max = subSum
                }
            }
            return max
        }
    }
}