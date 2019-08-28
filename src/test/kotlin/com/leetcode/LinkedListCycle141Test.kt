package com.leetcode

import com.leetcode.model.ListNode
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class LinkedListCycle141Test {

    private val solution = LinkedListCycle141().Solution()

    @Test
    fun `leetcode example test`() {
        val l1 = ListNode(1).apply { `val` = 1 }
        Assertions.assertEquals(false, solution.hasCycle(l1))
    }

    @Test
    fun `leetcode second example test`() {
        val l2 = ListNode(5)
        val l1 = ListNode(1).apply {
            `val` = 1
            next = ListNode(2).apply {
                `val` = 2
                next = l2
            }
        }
        l2.next = l1
        Assertions.assertEquals(true, solution.hasCycle(l1))
    }
}