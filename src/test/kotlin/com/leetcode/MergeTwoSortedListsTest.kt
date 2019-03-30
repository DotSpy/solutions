package com.leetcode

import com.leetcode.model.ListNode
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class MergeTwoSortedListsTest {

  lateinit var solution: MergeTwoSortedLists.Solution

  @BeforeEach
  fun `set up`() {
    solution = MergeTwoSortedLists.Solution()
  }

  @Test
  fun `1 list test`() {
    val expected = ListNode(1)
    Assertions.assertEquals(expected, solution.mergeTwoLists(expected, null))
  }

  @Test
  fun `simple example with 2 list 1 size`() {
    val expected = ListNode(1).apply {
      next = ListNode(2)
    }
    val firstList = ListNode(1)
    val secondList = ListNode(2)
    Assertions.assertEquals(expected, solution.mergeTwoLists(firstList, secondList))
  }

  @Test
  fun `leetcode example`() {
    val expected = ListNode(1).apply {
      `val` = 1
      next = ListNode(1).apply {
        `val` = 1
        next = ListNode(2).apply {
          `val` = 2
          next = ListNode(3).apply {
            `val` = 3
            next = ListNode(4).apply {
              `val` = 4
              next = ListNode(4).apply {
                `val` = 4
              }
            }
          }
        }
      }
    }
    //1->2->4, 1->3->4
    val l1 = ListNode(1).apply {
      `val` = 1
      next = ListNode(2).apply {
        `val` = 2
        next = ListNode(4).apply {
          `val` = 4
        }
      }
    }
    val l2 = ListNode(1).apply {
      `val` = 1
      next = ListNode(3).apply {
        `val` = 3
        next = ListNode(4).apply {
          `val` = 4
        }
      }
    }
    Assertions.assertEquals(expected, solution.mergeTwoLists(l1, l2))
  }
}