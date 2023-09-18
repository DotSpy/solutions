package com.leetcode

class BinarySearch {

    class Solution {
        fun search(nums: IntArray, target: Int): Int {
            return binarySearch(nums, target, 0, nums.lastIndex)
        }

        private fun binarySearch(nums: IntArray, target: Int, start: Int, end: Int): Int {
            val middle = (start + end) / 2
            return when {
                nums[middle] == target -> middle
                end - start <= 0 -> -1
                nums[middle] < target -> binarySearch(nums, target, middle + 1, end)
                else -> binarySearch(nums, target, start, middle - 1)
            }
        }
    }
}