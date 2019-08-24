package com.leetcode

/*
Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.

Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.

The order of output does not matter.

Example 1:

Input:
s: "cbaebabacd" p: "abc"

Output:
[0, 6]

Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".

Example 2:

Input:
s: "abab" p: "ab"

Output:
[0, 1, 2]

Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".

 */
class FindAllAnagramsInAString {

    class Solution {

        fun findAnagrams(s: String, p: String): List<Int> {
            if (s.isEmpty() || p.isEmpty() || p.length > s.length) {
                return emptyList()
            } else if (s == p) {
                return listOf(0)
            }
            val result = mutableListOf<Int>()
            var i = 0
            var wasFound = false
            while (true) {
                val notFoundChars = p.toMutableList()
                if (i + notFoundChars.size - 1 > s.lastIndex) {
                    break
                } else if (wasFound && s[i + notFoundChars.size - 1] == s[i - 1]) {
                    result.add(i)
                } else {
                    var j = i
                    wasFound = false
                    if (notFoundChars.contains(s[i])) {
                        while (true) {
                            if (notFoundChars.remove(s[j])) {
                                if (notFoundChars.size == 0) {
                                    result.add(i)
                                    wasFound = true
                                    break
                                }
                                ++j
                                if (j > s.lastIndex) {
                                    break
                                }
                            } else {
                                if (!p.contains(s[j])) {
                                    i = j
                                }
                                break
                            }
                        }
                    }
                }
                ++i
            }
            return result
        }
    }
}