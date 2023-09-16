package com.leetcode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SearchInsertPositionTest {

    private val solution = SearchInsertPosition.Solution()

    @Test
    fun leetCodeExample1() {
        val nums = intArrayOf(1, 3, 5, 6)
        val target = 5
        assertEquals(2, solution.searchInsert(nums, target))
    }

    @Test
    fun leetCodeExample2() {
        val nums = intArrayOf(1, 3, 5, 6)
        val target = 2
        assertEquals(1, solution.searchInsert(nums, target))
    }

    @Test
    fun leetCodeExample3() {
        val nums = intArrayOf(1, 3, 5, 6)
        val target = 7
        assertEquals(4, solution.searchInsert(nums, target))
    }

    @Test
    fun leetCodeExample4() {
        val nums = intArrayOf(1)
        val target = 0
        assertEquals(0, solution.searchInsert(nums, target))
    }

    @Test
    fun leetCodeExample5() {
        val nums = intArrayOf(1)
        val target = 1
        assertEquals(0, solution.searchInsert(nums, target))
    }

    @Test
    fun leetCodeExample6() {
        val nums = intArrayOf(1)
        val target = 2
        assertEquals(1, solution.searchInsert(nums, target))
    }

    @Test
    fun leetCodeExample7() {
        val nums = intArrayOf(1, 3, 5, 6)
        val target = 6
        assertEquals(3, solution.searchInsert(nums, target))
    }

    @Test
    fun leetCodeExample8() {
        val nums = intArrayOf(1, 3)
        val target = 4
        assertEquals(2, solution.searchInsert(nums, target))
    }

    @Test
    fun leetCodeExample9() {
        val nums = intArrayOf(1, 3, 5, 6)
        val target = 4
        assertEquals(2, solution.searchInsert(nums, target))
    }

}