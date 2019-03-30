package com.leetcode

import com.leetcode.model.ListNode

class MergeTwoSortedLists {

  class Solution {
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
      if (l1 == null && l2 == null) {
        return null
      }
      var link = ListNode(-1)
      val pointer = link
      var n1 = l1
      var n2 = l2
      while (!(n1 == null && n2 == null)) {
        link.next = ListNode(-1)
        link = link.next!!
        if (n2 == null || (n1 != null && n1.`val` <= n2.`val`)) {
          link.`val` = n1!!.`val`
          n1 = n1.next
        } else {
          link.`val` = n2.`val`
          n2 = n2.next
        }
      }
      return pointer.next
    }
  }
}