package com.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class HouseRobberTest {

    private val solution = HouseRobber.Solution()

    @Test
    fun `array of one should return this element`() = Assertions.assertEquals(1, solution.rob(intArrayOf(1)))

    @Test
    fun `array of two with second biggest should return it`() = Assertions.assertEquals(2, solution.rob(intArrayOf(1, 2)))

    @Test
    fun `array of two with first biggest should return it`() = Assertions.assertEquals(2, solution.rob(intArrayOf(2, 1)))

    @Test
    fun `out of order test`() = Assertions.assertEquals(6, solution.rob(intArrayOf(0, 3, 2, 2, 3)))

    @Test
    fun `leetcode example test`() = Assertions.assertEquals(4, solution.rob(intArrayOf(1, 2, 3, 1)))

    @Test
    fun `leetcode example test2`() = Assertions.assertEquals(12, solution.rob(intArrayOf(2, 7, 9, 3, 1)))
}