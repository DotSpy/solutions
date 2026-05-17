package com.neetcode

/**
 * Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.
 *
 * An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
 *
 * Example 1:
 *
 * Input: s = "racecar", t = "carrace"
 *
 * Output: true
 *
 * Example 2:
 *
 * Input: s = "jar", t = "jam"
 *
 * Output: false
 *
 * Constraints:
 *
 *     1 <= s.length, t.length <= 5 * 10^4
 *     s and t consist of lowercase English letters.
 *
 *
 */

class `Valid Anagram` {
    class Solution {
        fun isAnagram(s: String, t: String): Boolean {
            if (s.length != t.length) return false
            val sourceMap = mutableMapOf<Char, Int>()
            s.forEach { letter -> sourceMap.merge(letter, 1, { existing, new -> existing + new }) }
            for (letter in t) {
                val count = sourceMap[letter] ?: return false
                sourceMap[letter] = count - 1
                if (sourceMap[letter]!! < 0) {
                    return false
                }
            }
            return true
        }
    }
}