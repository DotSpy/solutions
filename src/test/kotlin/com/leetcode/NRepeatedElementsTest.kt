package com.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

internal class NRepeatedElementsTest {

  @ParameterizedTest
  @MethodSource("inputArrayAndResult")
  fun `base input from leetcode`(array: IntArray, expected: Int) {
    val solution = NRepeatedElements.Solution()
    Assertions.assertEquals(expected, solution.repeatedNTimes(array))
  }

  companion object {
    @JvmStatic
    @Suppress("unused")
    fun inputArrayAndResult(): Stream<Arguments> = Stream.of(
        Arguments.arguments(intArrayOf(1, 2, 3, 3), 3),
        Arguments.arguments(intArrayOf(2, 1, 2, 5, 3, 2), 2),
        Arguments.arguments(intArrayOf(5, 1, 5, 2, 5, 3, 5, 4), 5))
  }
}