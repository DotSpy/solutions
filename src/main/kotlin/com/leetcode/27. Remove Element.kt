package com.leetcode

class RemoveElement {
    class Solution {
        fun removeElement(nums: IntArray, `val`: Int): Int {
            var include = 0
            for (i in nums.indices) {
                if (nums[i] != `val`) {
                    nums[include] = nums[i]
                    include++
                }
            }
            return include
        }
    }
}