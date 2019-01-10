package com.leetcode

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

class ListNode(var `val`: Int = 0) {
  var next: ListNode? = null

  override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (javaClass != other?.javaClass) return false

    other as ListNode

    if (`val` != other.`val`) return false
    if (next != other.next) return false

    return true
  }

  override fun hashCode(): Int {
    var result = `val`
    result = 31 * result + (next?.hashCode() ?: 0)
    return result
  }

}