package com.leetcode

class FlippingAnImage {

  class Solution {
    fun flipAndInvertImage(A: Array<IntArray>): Array<IntArray> {
      val result = Array(A.size) { IntArray(A[0].size) }
      A.forEachIndexed { i, innerArray ->
        val innerResult = IntArray(innerArray.size) { 0 }
        innerArray.forEachIndexed { j, element ->
          if (element == 0) {
            innerResult[innerArray.size - 1 - j] = 1
          } else {
            innerResult[innerArray.size - 1 - j] = 0
          }
        }
        result[i] = innerResult
      }
      return result
    }
  }
}