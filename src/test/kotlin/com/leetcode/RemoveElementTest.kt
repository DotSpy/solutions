package com.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class RemoveElementTest {

    private val solution = RemoveElement.Solution()

    @Test
    fun leetCodeExample1() {
        val nums = intArrayOf(3, 2, 2, 3)
        val numsSize = solution.removeElement(nums, 3)
        assertEquals(2, numsSize)
        val expected = intArrayOf(2, 2)
        for (i in expected.indices) {
            assertTrue(expected.contains(nums[i]))
        }
    }

    @Test
    fun leetCodeExample2() {
        val nums = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2)
        val numsSize = solution.removeElement(nums, 2)
        assertEquals(5, numsSize)
        val expected = intArrayOf(0, 1, 4, 0, 3)
        for (i in expected.indices) {
            assertTrue(expected.contains(nums[i]))
        }
    }

    @Test
    fun leetCodeExample3() {
        val nums = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2)
        val numsSize = solution.removeElement(nums, 2)
        assertEquals(5, numsSize)
        val expected = intArrayOf(0, 1, 4, 0, 3)
        for (i in expected.indices) {
            assertTrue(expected.contains(nums[i]))
        }
    }

    @Test
    fun leetCodeExample4() {
        val nums = intArrayOf(0)
        val numsSize = solution.removeElement(nums, 1)
        assertEquals(1, numsSize)
        val expected = intArrayOf(0)
        for (i in expected.indices) {
            assertTrue(expected.contains(nums[i]))
        }
    }

    @Test
    fun leetCodeExample5() {
        val nums = intArrayOf(1)
        val numsSize = solution.removeElement(nums, 1)
        assertEquals(0, numsSize)
        val expected = intArrayOf()
        for (i in expected.indices) {
            assertTrue(expected.contains(nums[i]))
        }
    }

    @Test
    fun leetCodeExample6() {
        val nums = intArrayOf(3, 3)
        val numsSize = solution.removeElement(nums, 3)
        assertEquals(0, numsSize)
        val expected = intArrayOf()
        for (i in expected.indices) {
            assertTrue(expected.contains(nums[i]))
        }
    }

    @Test
    fun leetCodeExample7() {
        val nums = intArrayOf(4, 5)
        val numsSize = solution.removeElement(nums, 4)
        assertEquals(1, numsSize)
        val expected = intArrayOf(5)
        for (i in expected.indices) {
            assertTrue(expected.contains(nums[i]))
        }
    }
}