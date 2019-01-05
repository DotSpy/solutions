package com.leetcode

class SortArrayByParity {

  class Solution {

    fun sortArrayByParity(A: IntArray): IntArray {
      val resultArray = IntArray(A.size)
      var evenCursor = 0
      var oddCursor = A.size - 1
      for (element in A) {
        if (element % 2 == 0) {
          resultArray[evenCursor++] = element
        } else {
          resultArray[oddCursor--] = element
        }
      }
      return resultArray
    }
  }
}