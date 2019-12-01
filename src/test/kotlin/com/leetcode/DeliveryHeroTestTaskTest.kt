package com.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class DeliveryHeroTestTaskTest {

    private val task = DeliveryHeroTestTask()

    @Test
    fun `first example should return true`() = Assertions.assertTrue(task.compare("a3e", "1p2e"))
}