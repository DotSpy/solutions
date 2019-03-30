package com.leetcode

import com.leetcode.model.ListNode

class ReverseLinkedList {

  class Solution {
    fun reverseList(head: ListNode?): ListNode? {
      var root: ListNode? = null
      var currentHead = head
      while (currentHead != null) {
        val next = currentHead.next
        currentHead.next = root
        root = currentHead
        currentHead = next
      }
      return root
    }
  }
}