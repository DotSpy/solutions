package com.leetcode

/*
Given a string s and a dictionary of strings wordDict, add spaces in s to construct a sentence where each word is a valid dictionary word. Return all such possible sentences in any order.

Note that the same word in the dictionary may be reused multiple times in the segmentation.



Example 1:

Input: s = "catsanddog", wordDict = ["cat","cats","and","sand","dog"]
Output: ["cats and dog","cat sand dog"]

Example 2:

Input: s = "pineapplepenapple", wordDict = ["apple","pen","applepen","pine","pineapple"]
Output: ["pine apple pen apple","pineapple pen apple","pine applepen apple"]
Explanation: Note that you are allowed to reuse a dictionary word.

Example 3:

Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
Output: []



Constraints:

    1 <= s.length <= 20
    1 <= wordDict.length <= 1000
    1 <= wordDict[i].length <= 10
    s and wordDict[i] consist of only lowercase English letters.
    All the strings of wordDict are unique.


 */
class WordBreakII {

  class Solution {
    fun wordBreak(s: String, wordDict: List<String>): List<String> {
      val acc = mutableListOf<List<String>>()
      breakWord(s, wordDict, emptyList(), acc)
      return acc.flatMap { listOf(it.joinToString(" ")) }
    }

    private fun breakWord(s: String, wordDict: List<String>, path: List<String>, acc: MutableList<List<String>>) {
      if (s != "") {
        for (i in 0..s.lastIndex) {
          for (w in wordDict) {
            if (s.lastIndex >= i + w.length - 1) {
              val substring = s.substring(0, i + w.length)
              if (substring == w) {
                val currentPath = path.toMutableList().also { it.add(substring) }
                val rest = s.substring(i + w.length, s.lastIndex + 1)
                if (rest != "") {
                  breakWord(rest, wordDict, currentPath, acc)
                } else {
                  acc.add(currentPath)
                }
              }
            }
          }
        }
      }
    }
  }
}
