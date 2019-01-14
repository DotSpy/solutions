package com.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

internal class TwoSumTest {

  @ParameterizedTest
  @MethodSource("inputArrayAndResult")
  fun `base input from leetcode`(array: IntArray, target: Int, expected: IntArray) {
    val solution = TwoSum.Solution()
    Assertions.assertArrayEquals(expected, solution.twoSum(array, target))
  }

  companion object {
    @JvmStatic
    @Suppress("unused")
    fun inputArrayAndResult(): Stream<Arguments> = Stream.of(
        Arguments.arguments(intArrayOf(2, 7, 11, 15), 9, intArrayOf(0, 1)),
        Arguments.arguments(intArrayOf(-1, -2, -3, -4, -5), -8, intArrayOf(2, 4)),
        Arguments.arguments(intArrayOf(0, 4, 3, 0), 0, intArrayOf(0, 3)),
        Arguments.arguments(intArrayOf(1, 1, 11, 15, 2, 7), 9, intArrayOf(4, 5))
    )
  }
}