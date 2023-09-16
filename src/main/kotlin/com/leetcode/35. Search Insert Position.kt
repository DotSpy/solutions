package com.leetcode

import kotlin.math.max

/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1

Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4



Constraints:

    1 <= nums.length <= 104
    -104 <= nums[i] <= 104
    nums contains distinct values sorted in ascending order.
    -104 <= target <= 104


 */
class SearchInsertPosition {
    class Solution {
        fun searchInsert(nums: IntArray, target: Int): Int {
            return findPosition(nums, target, 0, nums.lastIndex)
        }

        private fun findPosition(nums: IntArray, target: Int, start: Int, end: Int): Int {
            val middle = (start + 1 + end) / 2
            return when {
                //out of boundaries
                start > middle || end < middle -> middle
                //eq
                nums[middle] == target -> middle
                //right
                nums[middle] < target -> findPosition(nums, target, middle + 1, end)
                //left
                else -> findPosition(nums, target, start, middle - 1)
            }
        }
    }
}
