package com.leetcode

import kotlin.math.max

/*
A string S of lowercase English letters is given. We want to partition this string into as many parts as possible so that each letter appears in at most one part, and return a list of integers representing the size of these parts.



Example 1:

Input: S = "ababcbacadefegdehijhklij"
Output: [9,7,8]
Explanation:
The partition is "ababcbaca", "defegde", "hijhklij".
This is a partition so that each letter appears in at most one part.
A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits S into less parts.



Note:

    S will have length in range [1, 500].
    S will consist of lowercase English letters ('a' to 'z') only.

 */
class PartitionLabels {

  class Solution {
    fun partitionLabels(S: String): List<Int> {
      val characterToPosition = mutableMapOf<Char, Int>()
      for (i in S.indices) {
        characterToPosition[S[i]] = i
      }
      var last = 0
      var start = 0
      val result = mutableListOf<Int>()
      for (i in S.indices) {
        last = max(last, characterToPosition[S[i]]!!)
        if (i == last) {
          result.add(last - start + 1)
          start = last + 1
        }
      }
      return result
    }
  }
}