package com.leetcode

import com.leetcode.model.ListNode
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RemoveNthNodeFromEndofListTest {

    private val solution = RemoveNthNodeFromEndofList.Solution()

    @Test
    fun leetcodeExample() {
        val list = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4).apply {
                        next = ListNode(5)
                    }
                }
            }
        }
        val result = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(5)
                }
            }
        }
        Assertions.assertEquals(result, solution.removeNthFromEnd(list, 2))
    }

    @Test
    fun leetcodeExample2() {
        val list = ListNode(1)
        Assertions.assertEquals(null, solution.removeNthFromEnd(list, 1))
    }

    @Test
    fun leetcodeExample3() {
        val list = ListNode(1).apply {
            next = ListNode(2)
        }
        val result = ListNode(1)
        Assertions.assertEquals(result, solution.removeNthFromEnd(list, 1))
    }

    @Test
    fun leetcodeExample4() {
        val list = ListNode(1).apply {
            next = ListNode(2)
        }
        val result = ListNode(2)
        Assertions.assertEquals(result, solution.removeNthFromEnd(list, 2))
    }
}