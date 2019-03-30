package com.leetcode.model

class ListNode(var `val`: Int) {

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