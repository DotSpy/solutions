package com.leetcode

class ValidSudoku {
    class Solution {
        fun isValidSudoku(board: Array<CharArray>): Boolean {
            var result = true
            var horizontal = mutableSetOf<Char>()
            val verticals = Array(9) { mutableSetOf<Char>() }
            val squares = Array(3) { Array(3) { mutableSetOf<Char>() } }
            for (i in 0..8) {
                for (j in 0..8) {
                    val currentChar = board[i][j]
                    if (currentChar != '.') {
                        if (!horizontal.add(currentChar) ||
                            !verticals[j].add(currentChar) ||
                            !squares[i / 3][j / 3].add(currentChar)
                        ) {
                            result = false
                        }
                    }
                }
                horizontal = mutableSetOf()
            }
            return result
        }
    }
}