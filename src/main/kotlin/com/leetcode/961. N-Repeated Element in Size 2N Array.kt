package com.leetcode

/*
In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.

Return the element repeated N times.
 */
class NRepeatedElements {
  class Solution {
    fun repeatedNTimes(A: IntArray): Int {
      val nums = HashSet<Int>()
      A.forEach {
        if (nums.contains(it)) {
          return it
        }
        nums.add(it)
      }
      throw IllegalStateException("No solution")
    }
  }
}