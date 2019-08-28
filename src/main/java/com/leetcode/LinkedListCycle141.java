package com.leetcode;

import com.leetcode.model.ListNode;

/*
Given a linked list, determine if it has a cycle in it.

To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.
 */
public class LinkedListCycle141 {

    public class Solution {

        public boolean hasCycle(ListNode head) {
            ListNode tortoise = head;
            ListNode hare = head;
            while (hare != null && hare.getNext() != null) {
                hare = hare.getNext();
                if (hare == tortoise) {
                    return true;
                }
                tortoise = tortoise.getNext();
                if (hare.getNext() == null) {
                    return false;
                }
                hare = hare.getNext();
                if (hare == tortoise) {
                    return true;
                }
            }
            return false;
        }
    }
}
