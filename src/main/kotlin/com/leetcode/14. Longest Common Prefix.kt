package com.leetcode

import java.util.Arrays

/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.



Constraints:

    1 <= strs.length <= 200
    0 <= strs[i].length <= 200
    strs[i] consists of only lowercase English letters.

 */

class LongestCommonPrefix {
    class Solution {
        fun longestCommonPrefix(strs: Array<String>): String {
            var commonPrefix = ""
            Arrays.sort(strs)
            for (i in strs[0].indices) {
                if (strs[0][i] == strs.last()[i]) {
                    commonPrefix += strs[0][i]
                } else {
                    break
                }
            }
            return commonPrefix
        }
    }
}