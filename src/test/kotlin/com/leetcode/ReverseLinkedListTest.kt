package com.leetcode

import com.leetcode.model.ListNode
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class ReverseLinkedListTest {

  @Test
  fun `leetcode example`() {
    val solution = ReverseLinkedList.Solution()
    val input = ListNode(1).apply {
      `val` = 1
      next = ListNode(2).apply {
        `val` = 2
        next = ListNode(3).apply {
          `val` = 3
          next = ListNode(4).apply {
            `val` = 4
            next = ListNode(5).apply {
              `val` = 5
              next = null
            }
          }
        }
      }
    }
    val expected = ListNode(5).apply {
      `val` = 5
      next = ListNode(4).apply {
        `val` = 4
        next = ListNode(3).apply {
          `val` = 3
          next = ListNode(2).apply {
            `val` = 2
            next = ListNode(1).apply {
              `val` = 1
              next = null
            }
          }
        }
      }
    }
    Assertions.assertEquals(expected, solution.reverseList(input))
  }
}