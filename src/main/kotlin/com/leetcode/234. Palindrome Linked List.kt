package com.leetcode

import com.leetcode.model.ListNode

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class PalindromeLinkedList {

    class Solution {

        fun isPalindrome(head: ListNode?): Boolean {
            if (head?.next == null) {
                return true
            }
            var root = head
            var tail: ListNode? = null
            var fast: ListNode? = root
            while (true) {
                fast = fast?.next
                if (fast == null) {
                    root = root!!.next
                    break
                }
                val currentRoot = root
                root = root!!.next
                currentRoot!!.next = tail
                tail = currentRoot
                fast = fast.next
                if (fast == null) {
                    break
                }
            }
            while (true) {
                if (tail?.`val` == null && root?.`val` == null) {
                    return true
                } else if (tail?.`val` != root?.`val`) {
                    return false
                } else {
                    tail = tail?.next
                    root = root?.next
                }
            }
        }

    }
}