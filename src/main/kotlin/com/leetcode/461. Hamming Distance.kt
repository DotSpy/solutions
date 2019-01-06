package com.leetcode

class HammingDistance {

  class Solution {

    fun hammingDistance(x: Int, y: Int): Int {
      var xor = x.xor(y)
      var count = 0
      while (xor != 0) {
        xor = xor.and(xor-1)
        count++
      }
      return count
    }
  }
}