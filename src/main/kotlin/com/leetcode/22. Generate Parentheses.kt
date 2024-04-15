package com.leetcode

class GenerateParentheses {
    class Solution {
        fun generateParenthesis(n: Int): List<String> {
            val result = mutableListOf<String>()
            generateParenthesis(0, 0, result, "", n)
            return result.toList()
        }

        private fun generateParenthesis(
            open: Int,
            close: Int,
            result: MutableList<String>,
            current: String,
            n: Int
        ) {
            if (current.length == n * 2) {
                result.add(current)
            } else {
                if (open < n) {
                    generateParenthesis(
                        open + 1,
                        close,
                        result,
                        "$current(",
                        n
                    )
                }
                if (close < open) {
                    generateParenthesis(
                        open,
                        close + 1,
                        result,
                        "$current)",
                        n
                    )
                }
            }
        }
    }
}