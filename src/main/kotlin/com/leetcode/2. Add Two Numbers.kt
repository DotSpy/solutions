package com.leetcode

import com.leetcode.model.ListNode

/*
You are given two non-empty linked lists representing two non-negative integers.
 The digits are stored in reverse order, and each of their nodes contains a single digit.
  Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example 1:

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]

Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]



Constraints:

    The number of nodes in each linked list is in the range [1, 100].
    0 <= Node.val <= 9
    It is guaranteed that the list represents a number that does not have leading zeros.
 */
class AddTwoNumbers {

    class Solution {
        fun addTwoNumbers(l1: ListNode, l2: ListNode): ListNode {
            return addTwoLists(l1, l2)
        }

        private fun addTwoLists(firstNumber: ListNode, secondNumber: ListNode): ListNode {
            var first: ListNode? = firstNumber
            var second: ListNode? = secondNumber
            var carry = 0
            var head: ListNode? = null
            var result: ListNode? = null
            while (carry != 0 || first?.`val` != null || second?.`val` != null) {
                val val1 = first?.`val` ?: 0
                val val2 = second?.`val` ?: 0
                val value = val1 + val2 + carry
                carry = if (value >= 10) 1 else 0
                if (head == null) {
                    head = ListNode(value % 10)
                    result = head
                } else {
                    head.next = ListNode(value % 10)
                    head = head.next
                }
                first = first?.next
                second = second?.next
            }
            return result!!
        }

    }
}
