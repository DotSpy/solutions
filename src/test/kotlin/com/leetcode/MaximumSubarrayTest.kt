package com.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class MaximumSubarrayTest {

    @Test
    fun `leetcode example`() {
        val solution = MaximumSubarray.Solution()
        val input = intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)
        Assertions.assertEquals(6, solution.maxSubArray(input))
    }

    @Test
    fun `base sum test`() {
        val solution = MaximumSubarray.Solution()
        val input = intArrayOf(1, 3)
        Assertions.assertEquals(4, solution.maxSubArray(input))
    }

    @Test
    fun `negative array test`() {
        val solution = MaximumSubarray.Solution()
        val input = intArrayOf(-5, -3, -10)
        Assertions.assertEquals(-3, solution.maxSubArray(input))
    }

    @Test
    fun `just negative number test`() {
        val solution = MaximumSubarray.Solution()
        val input = intArrayOf(-5)
        Assertions.assertEquals(-5, solution.maxSubArray(input))
    }

    @Test
    fun `just positive number test`() {
        val solution = MaximumSubarray.Solution()
        val input = intArrayOf(5)
        Assertions.assertEquals(5, solution.maxSubArray(input))
    }

    @Test
    fun `max part test`() {
        val solution = MaximumSubarray.Solution()
        val input = intArrayOf(1, 3, -5)
        Assertions.assertEquals(4, solution.maxSubArray(input))
    }
}