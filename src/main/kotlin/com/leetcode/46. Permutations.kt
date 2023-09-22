package com.leetcode

class Permutations {

    class Solution {
        fun permute(nums: IntArray): List<List<Int>> {
            val result = mutableListOf<MutableList<Int>>()
            if (nums.size == 1) {
                result.add(nums.toMutableList())
                return result
            }
            for (i in 0..nums.lastIndex) {
                addPermutation(result, nums, 0, i)
            }
            return result
        }

        private fun addPermutation(result: MutableList<MutableList<Int>>, nums: IntArray, swapIndex: Int, swapWith: Int) {
            val permutation = swap(nums, swapIndex, swapWith)
            if (swapIndex + 1 == nums.lastIndex) {
                result.add(permutation.toMutableList())
            } else {
                val j = swapIndex + 1
                for (i in j..nums.lastIndex) {
                    addPermutation(result, permutation, j, i)
                }
            }
        }

        private fun swap(nums: IntArray, swapIndex: Int, swapWith: Int): IntArray {
            val permutation = nums.clone()
            val tmp = permutation[swapIndex]
            permutation[swapIndex] = permutation[swapWith]
            permutation[swapWith] = tmp
            return permutation
        }
    }
}