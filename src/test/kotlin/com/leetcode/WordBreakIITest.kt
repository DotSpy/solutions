package com.leetcode

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class WordBreakIITest {

  private val solution = WordBreakII.Solution()

  @Test
  fun leetcodeExample1() {
    val expected = listOf("cats and dog", "cat sand dog")
    val result = solution.wordBreak("catsanddog", listOf("cat", "cats", "and", "sand", "dog"))
    assertTrue(expected.size == result.size && expected.containsAll(result) && result.containsAll(expected))
  }

  @Test
  fun leetcodeExample2() {
    val expected = listOf("pine apple pen apple", "pineapple pen apple", "pine applepen apple")
    val result = solution.wordBreak("pineapplepenapple", listOf("apple", "pen", "applepen", "pine", "pineapple"))
    assertTrue(expected.size == result.size && expected.containsAll(result) && result.containsAll(expected))
  }

  @Test
  fun leetcodeExample3() {
    val expected = emptyList<String>()
    val result = solution.wordBreak("catsandog", listOf("cats", "dog", "sand", "and", "cat"))
    assertTrue(expected.size == result.size && expected.containsAll(result) && result.containsAll(expected))
  }
}
