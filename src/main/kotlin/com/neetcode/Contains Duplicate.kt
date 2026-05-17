package com.neetcode

// same as  217. Contains Duplicate
class `Contains Duplicate` {

    class Solution {

        fun hasDuplicate(nums: IntArray): Boolean {
            val set = mutableSetOf<Int>()
            for (it in nums) {
                if (!set.add(it)) {
                    return true
                }
            }
            return false
        }
    }
}