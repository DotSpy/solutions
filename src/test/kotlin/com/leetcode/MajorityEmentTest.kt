package com.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

internal class MajorityEmentTest {

  @ParameterizedTest
  @MethodSource("inputArrayAndResult")
  fun `base input from leetcode`(array: IntArray, expected: Int) {
    val solution = MajorityEment.Solution()
    Assertions.assertEquals(expected, solution.majorityElement(array))
  }

  companion object {
    @JvmStatic
    @Suppress("unused")
    fun inputArrayAndResult(): Stream<Arguments> = Stream.of(
        Arguments.arguments(intArrayOf(3, 2, 3), 3),
        Arguments.arguments(intArrayOf(2, 2, 1, 1, 1, 2, 2), 2),
        Arguments.arguments(intArrayOf(8, 8, 7, 7, 7), 7),
        Arguments.arguments(intArrayOf(10, 9, 9, 9, 10), 9),
        Arguments.arguments(intArrayOf(5), 5))
  }
}