package com.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

internal class SortArrayByParityTest {

  @ParameterizedTest
  @MethodSource("argsAndResultProvider")
  fun `sort array test`(input: Array<Int>, expected: Array<Int>) {
    val solution = SortArrayByParity.Solution()
    Assertions.assertArrayEquals(expected.toIntArray(), solution.sortArrayByParity(input.toIntArray()))
  }

  companion object {
    @JvmStatic
    @Suppress("unused")
    fun argsAndResultProvider(): Stream<Arguments> = Stream.of(
        Arguments.arguments(arrayOf(3, 1, 2, 4), arrayOf(2, 4, 1, 3)))
  }
}