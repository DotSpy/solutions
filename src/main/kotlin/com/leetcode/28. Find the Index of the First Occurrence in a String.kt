package com.leetcode

class FindtheIndexoftheFirstOccurrenceinaString {

    class Solution {
        fun strStr(haystack: String, needle: String): Int {
            var result = -1
            if (needle.length > haystack.length) {
                return result
            }
            for (i in 0..haystack.lastIndex) {
                if (haystack[i] == needle[0]) {
                    for (j in 0..needle.lastIndex) {
                        if (i + j > haystack.lastIndex || haystack[i + j] != needle[j]) {
                            break
                        } else if (j == needle.lastIndex) {
                            result = i
                        }
                    }
                }
                if (result != -1) {
                    break
                }
            }
            return result
        }
    }
}
