package com.leetcode

class LetterCombinationsOfAPhoneNumber {

    class Solution {

        private val digitToChars = mapOf(
                '2' to setOf('a', 'b', 'c'),
                '3' to setOf('d', 'e', 'f'),
                '4' to setOf('g', 'h', 'i'),
                '5' to setOf('j', 'k', 'l'),
                '6' to setOf('m', 'n', 'o'),
                '7' to setOf('p', 'q', 'r', 's'),
                '8' to setOf('t', 'u', 'v'),
                '9' to setOf('w', 'x', 'y', 'z')
        )

        fun letterCombinations(digits: String): List<String> {
            val result = mutableListOf<String>()
            digits.forEach { char -> addPermutations(char, result) }
            return result
        }

        private fun addPermutations(digit: Char, permutations: MutableList<String>) {
            if (permutations.isEmpty()) {
                digitToChars.getValue(digit).forEach { newChar ->
                    permutations.add(newChar.toString())
                }
            } else {
                val lastIndex = permutations.lastIndex
                for (i in 0..lastIndex) {
                    val initial = permutations[i]
                    digitToChars.getValue(digit).forEach { newChar ->
                        permutations.add(initial + newChar)
                    }
                }
                for (i in 0..lastIndex) {
                    permutations.removeAt(0)
                }
            }
        }
    }
}
