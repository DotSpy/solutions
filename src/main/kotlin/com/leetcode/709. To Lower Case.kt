package com.leetcode

/*
Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
 */
class ToLowerCase {
  class Solution {
    fun toLowerCase(str: String): String {
      val sb = StringBuilder()
      for (char in str) {
        val decimalValue = char.toInt()
        if (decimalValue >= 65 && char.toInt() <= 90) {
          sb.append((char.toInt() + 32).toChar())
        } else {
          sb.append(char)
        }
      }
      return sb.toString()
    }
  }
}