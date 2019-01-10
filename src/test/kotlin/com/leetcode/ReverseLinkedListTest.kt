package com.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class ReverseLinkedListTest {

  @Test
  fun `leetcode example`() {
    val solution = ReverseLinkedList.Solution()
    val input = ListNode().apply {
      `val` = 1
      next = ListNode().apply {
        `val` = 2
        next = ListNode().apply {
          `val` = 3
          next = ListNode().apply {
            `val` = 4
            next = ListNode().apply {
              `val` = 5
              next = null
            }
          }
        }
      }
    }
    val expected = ListNode().apply {
      `val` = 5
      next = ListNode().apply {
        `val` = 4
        next = ListNode().apply {
          `val` = 3
          next = ListNode().apply {
            `val` = 2
            next = ListNode().apply {
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