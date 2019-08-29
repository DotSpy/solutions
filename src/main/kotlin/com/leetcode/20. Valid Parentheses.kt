package com.leetcode

import java.util.*

class ValidParentheses {
    class Solution {
        fun isValid(s: String): Boolean {
            val openBrackets = Stack<Char>()
            for (p in s.toCharArray()) {
                when (p) {
                    '(' -> {
                        openBrackets.push(p)
                    }
                    '{' -> {
                        openBrackets.push(p)
                    }
                    '[' -> {
                        openBrackets.push(p)
                    }
                    ')' -> {
                        if (openBrackets.empty() || openBrackets.pop() != '(') {
                            return false
                        }
                    }
                    '}' -> {
                        if (openBrackets.empty() || openBrackets.pop() != '{') {
                            return false
                        }
                    }
                    ']' -> {
                        if (openBrackets.empty() || openBrackets.pop() != '[') {
                            return false
                        }
                    }
                }
            }
            if (!openBrackets.isEmpty()) {
                return false
            }
            return true
        }
    }
}