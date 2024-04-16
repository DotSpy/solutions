package com.leetcode

class PlusOne {
    class Solution {
        fun plusOne(digits: IntArray): IntArray {
            return plusOne(digits, digits.lastIndex)
        }

        private fun plusOne(digits: IntArray, index: Int): IntArray {
            if (digits[index] == 9) {
                digits[index] = 0
                if (index == 0) {
                    val new = IntArray(digits.size + 1) { 0 }
                    new[0] = 1
                    return new
                } else {
                    return plusOne(digits, index - 1)
                }
            } else {
                digits[index] += 1
            }
            return digits
        }
    }
}