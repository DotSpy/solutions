package com.neetcode

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertContentEquals

class `Two SumTest` {

    @ParameterizedTest
    @MethodSource("dataProvider")
    fun firstExample(numbers: IntArray, target: Int, expected: IntArray) {
        assertContentEquals(expected, `Two Sum`.Solution().twoSum(numbers, target))
    }

    companion object {
        @JvmStatic
        fun dataProvider(): Stream<Arguments> = Stream.of(
            Arguments.of(intArrayOf(1, 2, 3, 3), 6, intArrayOf(2, 3)),
            Arguments.of(intArrayOf(1, 3, 4, 2), 6, intArrayOf(2, 3)),
            Arguments.of(intArrayOf(3, 3, -3, -3), -6, intArrayOf(2, 3)),
            Arguments.of(intArrayOf(3, 4, 5, 6), 7, intArrayOf(0, 1)),
            Arguments.of(intArrayOf(4, 5, 6), 10, intArrayOf(0, 2)),
            Arguments.of(intArrayOf(5, 5), 10, intArrayOf(0, 1))
        )
    }
}