package com.leetcode

/*
Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in
their binary representation and return them as an array.

Example 1:

Input: 2
Output: [0,1,1]

Example 2:

Input: 5
Output: [0,1,1,2,1,2]

Follow up:

    It is very easy to come up with a solution with run time O(n*sizeof(integer)). But can you do it in linear time O(n) /possibly in a single pass?
    Space complexity should be O(n).
    Can you do it like a boss? Do it without using any builtin function like __builtin_popcount in c++ or in any other language.

 */
class CountingBits {

  class Solution {
    fun countBits(num: Int): IntArray {
      if (num == 0) {
        return intArrayOf(0)
      }
      val size = num + 1
      val result = IntArray(size)
      result[0] = 0
      result[1] = 1
      for (i in 0 until size) {
        result[i] = result[i / 2] + i % 2
      }
      return result
    }
  }
}