package com.neetcode

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertEquals

class `Contains DuplicateTest` {

    @ParameterizedTest
    @MethodSource("dataProvider")
    fun firstExample(numbers: IntArray, expected: Boolean) {
        assertEquals(expected, `Contains Duplicate`.Solution().hasDuplicate(numbers))
    }

    companion object {
        @JvmStatic
        fun dataProvider(): Stream<Arguments> = Stream.of(
            Arguments.of(intArrayOf(1, 2, 3, 3), true),
            Arguments.of(intArrayOf(1, 2, 3, 4), false),
            Arguments.of(intArrayOf(), false),
            Arguments.of(intArrayOf(-1, 2, 3), false)
        )
    }
}