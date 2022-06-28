package com.leetcode

class RomanToInteger {

  class Solution {
    private val romanToIntegerMap = mapOf(
      'I' to 1,
      'V' to 5,
      'X' to 10,
      'L' to 50,
      'C' to 100,
      'D' to 500,
      'M' to 1000
    )

    fun romanToInt(s: String): Int {
      var result = 0
      var i = s.lastIndex
      while (i >= 0) {
        if (i - 1 >= 0 && romanToIntegerMap.getValue(s[i - 1]) < romanToIntegerMap.getValue(s[i])) {
          result += romanToIntegerMap.getValue(s[i]) - romanToIntegerMap.getValue(s[i - 1])
          i -= 2
        } else {
          result += romanToIntegerMap.getValue(s[i])
          i--
        }
      }
      return result
    }
  }
}
