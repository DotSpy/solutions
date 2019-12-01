package com.leetcode

/*
Given a singly linked list, determine if it is a palindrome.

Example 1:

Input: 1->2
Output: false

Example 2:

Input: 1->2->2->1
Output: true

Follow up:
Could you do it in O(n) time and O(1) space?

 */

class PalindromeLinkedList {

  class Solution {

    fun isPalindrome(head: ListNode?): Boolean {
      var fast = head
      var slow = head
      var middle: ListNode?
      while (fast?.next != null) {
      fast = fast.next
      if (fast?.next != null) {
      fast = fast!!.next
      val previous = slow
      slow = slow!!.next
      previous!!.next =
    }
    }
      middle = slow
    }
  }
}
class PalindromeLinkedList {

}
