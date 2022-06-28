package com.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class PalindromeNumberTest {

  private val solution = PalindromeNumber.Solution()

  @Test
  fun `leetcode example 1`() {
    assertEquals(true, solution.isPalindrome(121))
  }

  @Test
  fun `leetcode example 2`() {
    assertEquals(false, solution.isPalindrome(-121))
  }

  @Test
  fun `leetcode example 3`() {
    assertEquals(false, solution.isPalindrome(10))
  }

  @Test
  fun `leetcode example 4`() {
    assertEquals(true, solution.isPalindrome(0))
  }
}
