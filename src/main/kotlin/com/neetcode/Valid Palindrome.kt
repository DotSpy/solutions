package com.neetcode

/**
 * https://neetcode.io/problems/is-palindrome/question?list=neetcode150
 * Valid Palindrome
 * Easy Topics Company Tags
 * Hints
 *
 * Given a string s, return true if it is a palindrome, otherwise return false.
 *
 * A palindrome is a string that reads the same forward and backward. It is also case-insensitive and ignores all non-alphanumeric characters.
 *
 * Note: Alphanumeric characters consist of letters (A-Z, a-z) and numbers (0-9).
 *
 * Example 1:
 *
 * Input: s = "Was it a car or a cat I saw?"
 *
 * Output: true
 *
 * Explanation: After considering only alphanumerical characters we have "wasitacaroracatisaw", which is a palindrome.
 *
 * Example 2:
 *
 * Input: s = "tab a cat"
 *
 * Output: false
 *
 * Explanation: "tabacat" is not a palindrome.
 *
 * Constraints:
 *
 *     1 <= s.length <= 1000
 *     s is made up of only printable ASCII characters.
 * 
 */
class `Valid Palindrome` {
    class Solution {
        fun isPalindrome(s: String): Boolean {
            val alphanumerical = s.replace("[^A-Za-z0-9]".toRegex(), "").lowercase()
            if (alphanumerical.length <= 1) {
                return true
            }
            var i = 0
            var endPointer = alphanumerical.lastIndex
            while (i < endPointer) {
                if (alphanumerical[i] != alphanumerical[endPointer]) {
                    return false
                }
                ++i
                endPointer = alphanumerical.lastIndex - i
            }
            return true
        }
    }
}