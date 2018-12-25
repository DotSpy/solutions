package com.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

internal class ToLowerCaseTest {

  @ParameterizedTest
  @MethodSource("argsAndResultProvider")
  fun `base input from leetcode`(string: String, expected: String) {
    val solution = ToLowerCase.Solution()
    Assertions.assertEquals(expected, solution.toLowerCase(string))
  }

  companion object {
    @JvmStatic
    @Suppress("unused")
    fun argsAndResultProvider(): Stream<Arguments> = Stream.of(
        Arguments.arguments("Hello", "hello"),
        Arguments.arguments("here", "here"),
        Arguments.arguments("LOVELY", "lovely"))
  }
}