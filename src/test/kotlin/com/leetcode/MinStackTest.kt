package com.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class MinStackTest {

    @Test
    fun `leetcode example test`() {
        val minStack = MinStack()
        minStack.push(-2)
        minStack.push(0)
        minStack.push(-3)
        Assertions.assertEquals(-3, minStack.getMin())
        minStack.pop()
        Assertions.assertEquals(0, minStack.top())
        Assertions.assertEquals(-2, minStack.getMin())
    }
}