package com.leetcode

class RemoveElement {
    class Solution {
        fun removeElement(nums: IntArray, `val`: Int): Int {
            var j = nums.lastIndex
            var i = 0
            while (i < j) {
                if (nums[i] == `val`) {
                    while (j < nums.size) {
                        if (nums[j] != `val`) {
                            nums[i] = nums[j]
                            nums[j] = `val`
                            j--
                            break
                        }
                        j--
                    }
                    if (j <= i) {
                        break
                    }
                }
                i++
            }
            return i + 1
        }
    }
}