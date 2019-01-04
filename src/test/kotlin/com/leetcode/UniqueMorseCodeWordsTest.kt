package com.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

internal class UniqueMorseCodeWordsTest {

  @ParameterizedTest
  @MethodSource("argsAndResultProvider")
  fun `base input from leetcode`(input: Array<String>, expected: Int) {
    val solution = UniqueMorseCodeWords.Solution()
    Assertions.assertEquals(expected, solution.uniqueMorseRepresentations(input))
  }

  companion object {
    @JvmStatic
    @Suppress("unused")
    fun argsAndResultProvider(): Stream<Arguments> = Stream.of(
        Arguments.arguments(arrayOf("gin", "zen", "gig", "msg"), 2))
  }
}