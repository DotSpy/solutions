package com.leetcode

import kotlin.math.max
import kotlin.math.min

/*
Given a collection of intervals, merge all overlapping intervals.

Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].

Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.

NOTE: input types have been changed on April 15, 2019. Please reset to default code definition to get new method signature.



Constraints:

    intervals[i][0] <= intervals[i][1]


 */
class MergeIntervals {
  class Solution {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
      if (intervals.isEmpty()) {
        return emptyArray()
      }
      intervals.sortBy { it[0] }
      val result = mutableListOf<IntArray>()
      var current = intervals[0]
      result.add(current)
      for (interval in intervals) {
        if (current[1] >= interval[0]) {
          current[1] = max(current[1], interval[1])
        } else {
          current = intArrayOf(interval[0], interval[1])
          result.add(current)
        }
      }
      return result.toTypedArray()
    }
  }
}
