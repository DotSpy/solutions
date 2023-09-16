package com.leetcode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RemoveDuplicatesFromSortedArrayTest {

    private val solution = RemoveDuplicatesFromSortedArray.Solution()

    @Test
    fun leetCodeExample1() {
        val nums = intArrayOf(1, 1, 2)
        val numsSize = solution.removeDuplicates(nums)
        assertEquals(2, numsSize)
        val expected = intArrayOf(1, 2)
        for (i in expected.indices) {
            assertEquals(expected[i], nums[i])
        }
    }

    @Test
    fun leetCodeExample2() {
        val nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
        val numsSize = solution.removeDuplicates(nums)
        assertEquals(5, numsSize)
        val expected = intArrayOf(0, 1, 2, 3, 4)
        for (i in expected.indices) {
            assertEquals(expected[i], nums[i])
        }
    }

    @Test
    fun leetCodeExample3() {
        val nums = intArrayOf(1, 1, 1)
        val numsSize = solution.removeDuplicates(nums)
        assertEquals(1, numsSize)
        val expected = intArrayOf(1)
        for (i in expected.indices) {
            assertEquals(expected[i], nums[i])
        }
    }

    @Test
    fun leetCodeExample4() {
        val nums = intArrayOf(1, 1, 1, 1)
        val numsSize = solution.removeDuplicates(nums)
        assertEquals(1, numsSize)
        val expected = intArrayOf(1)
        for (i in expected.indices) {
            assertEquals(expected[i], nums[i])
        }
    }

    @Test
    fun leetCodeExample5() {
        val nums = intArrayOf(1, 2)
        val numsSize = solution.removeDuplicates(nums)
        assertEquals(2, numsSize)
        val expected = intArrayOf(1, 2)
        for (i in expected.indices) {
            assertEquals(expected[i], nums[i])
        }
    }

    @Test
    fun leetCodeExample6() {
        val nums = intArrayOf(1, 2, 2, 2)
        val numsSize = solution.removeDuplicates(nums)
        assertEquals(2, numsSize)
        val expected = intArrayOf(1, 2)
        for (i in expected.indices) {
            assertEquals(expected[i], nums[i])
        }
    }
}