package com.leetcode

/*
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:



Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

Example 2:

Input: numRows = 1
Output: [[1]]



Constraints:

    1 <= numRows <= 30


 */

class PascalsTriangle {

    class Solution {
        fun generate(numRows: Int): List<List<Int>> {
            val result = mutableListOf(mutableListOf(1))
            for (i in 1 until numRows) {
                for (j in 0..i) {
                    val previousRow = result[i - 1]
                    var value = 0
                    if (j != 0) {
                        value += previousRow[j - 1]
                    } else {
                        result.add(mutableListOf())
                    }
                    if (j <= previousRow.lastIndex) {
                        value += previousRow[j]
                    }
                    result[i].add(value)
                }
            }
            return result
        }
    }
}