package com.leetcode

/*
Given an integer array nums of unique elements, return all possible
subsets
(the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.



Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

Example 2:

Input: nums = [0]
Output: [[],[0]]



Constraints:

    1 <= nums.length <= 10
    -10 <= nums[i] <= 10
    All the numbers of nums are unique.

 */
class Subsets {
    class Solution {
        fun subsets(nums: IntArray): List<List<Int>> {
            val result = mutableListOf<MutableList<Int>>()
            exclude(result, nums, 0, mutableListOf())
            include(result, nums, 0, mutableListOf())
            return result
        }

        private fun exclude(result: MutableList<MutableList<Int>>, nums: IntArray, fixed: Int, current: MutableList<Int>) {
            if (fixed == nums.lastIndex) {
                result.add(current)
            } else {
                exclude(result, nums, fixed + 1, current)
                include(result, nums, fixed + 1, current)
            }
        }

        private fun include(result: MutableList<MutableList<Int>>, nums: IntArray, fixed: Int, current: MutableList<Int>) {
            val new = current.toMutableList().also { it.add(nums[fixed]) }
            if (fixed == nums.lastIndex) {
                result.add(new)
            } else {
                exclude(result, nums, fixed + 1, new)
                include(result, nums, fixed + 1, new)
            }
        }
    }
}