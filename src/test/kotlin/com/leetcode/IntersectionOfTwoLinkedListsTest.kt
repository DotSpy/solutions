package com.leetcode

import com.leetcode.model.ListNode
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class IntersectionOfTwoLinkedListsTest {

  private val solution = IntersectionOfTwoLinkedLists.Solution()

  /*
  intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5]
   */
  @Test
  fun `leetcode first example`() {
    val intersection = ListNode(8).apply {
      next = ListNode(4).apply {
        next = ListNode(5)
      }
    }
    val listA = ListNode(4).apply {
      next = ListNode(1).apply {
        next = intersection
      }
    }
    val listB = ListNode(5).apply {
      next = ListNode(6).apply {
        next = ListNode(1).apply {
          next = intersection
        }
      }
    }
    Assertions.assertEquals(intersection, solution.getIntersectionNode(listA, listB))
  }

  /*
  intersectVal = 2, listA = [1,9,1,2,4], listB = [3,2,4]
   */
  @Test
  fun `leetcode second example`() {
    val intersection = ListNode(2).apply {
      next = ListNode(4)
    }
    val listA = ListNode(3).apply {
      next = intersection
    }
    val listB = ListNode(1).apply {
      next = ListNode(9).apply {
        next = ListNode(1).apply {
          next = intersection
        }
      }
    }
    Assertions.assertEquals(intersection, solution.getIntersectionNode(listA, listB))
  }

  /*
  intersectVal = 0, listA = [2,6,4], listB = [1,5]
 */
  @Test
  fun `leetcode third example`() {
    val intersection = null
    val listA = ListNode(1).apply {
      next = ListNode(5).apply {
        next = intersection
      }
    }
    val listB = ListNode(2).apply {
      next = ListNode(6).apply {
        next = ListNode(4).apply {
          next = intersection
        }
      }
    }
    Assertions.assertEquals(intersection, solution.getIntersectionNode(listA, listB))
  }

  /*
  intersectVal = 0, listA = [1,3], listB = []
  */
  @Test
  fun `leetcode forth example`() {
    val intersection = null
    val listA = ListNode(1).apply {
      next = ListNode(3).apply {
        next = intersection
      }
    }
    val listB = null
    Assertions.assertEquals(intersection, solution.getIntersectionNode(listA, listB))
  }
}