package com.leetcode

import com.leetcode.model.ListNode
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class PalindromeLinkedListTest {

    private val solution = PalindromeLinkedList.Solution()

    @Test
    fun `leetcode example list is not palindrome test`() {
        val input = ListNode(1).apply {
            `val` = 1
            next = ListNode(2).apply {
                `val` = 2
            }
        }
        Assertions.assertFalse(solution.isPalindrome(input))
    }

    @Test
    fun `leetcode example is palindrom test`() {
        val input = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(2).apply {
                    next = ListNode(1)
                }
            }
        }
        Assertions.assertTrue(solution.isPalindrome(input))
    }

    @Test
    fun `null should return true`() {
        Assertions.assertTrue(solution.isPalindrome(null))
    }

    @Test
    fun `one node should return true`() {
        val input = ListNode(1)
        Assertions.assertTrue(solution.isPalindrome(input))
    }

    @Test
    fun `(0,0) should return true`() {
        val input = ListNode(0).apply {
            next = ListNode(0)
        }
        Assertions.assertTrue(solution.isPalindrome(input))
    }

    @Test
    fun `(1,0,1) should return true`() {
        val input = ListNode(1).apply {
            next = ListNode(0).apply {
                next = ListNode(1)
            }
        }
        Assertions.assertTrue(solution.isPalindrome(input))
    }
}