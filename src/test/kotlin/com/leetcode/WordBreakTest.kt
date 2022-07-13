package com.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class WordBreakTest {

  private val solution = WordBreak.Solution()

  @Test
  fun leetcodeExample1() {
    assertEquals(true, solution.wordBreak("leetcode", listOf("leet", "code")))
  }

  @Test
  fun leetcodeExample2() {
    assertEquals(false, solution.wordBreak("catsandog", listOf("cats", "dog", "sand", "and", "cat")))
  }

  @Test
  fun leetcodeExample3() {
    assertEquals(true, solution.wordBreak("cars", listOf("car", "ca", "rs")))
  }

  @Test
  fun leetcodeExample4() {
    assertEquals(false, solution.wordBreak("ccbb", listOf("bc", "cb")))
  }

  @Test
  fun leetcodeExample5() {
    assertEquals(true, solution.wordBreak("a", listOf("a")))
  }
}
