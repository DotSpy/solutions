package com.neetcode

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertEquals

class `Valid AnagramTest` {

    @ParameterizedTest
    @MethodSource("dataProvider")
    fun firstExample(s: String, t: String, expected: Boolean) {
        assertEquals(expected, `Valid Anagram`.Solution().isAnagram(s, t))
    }

    companion object {
        @JvmStatic
        fun dataProvider(): Stream<Arguments> = Stream.of(
            Arguments.of("racecar", "carrace", true),
            Arguments.of("carrace", "racecar", true),
            Arguments.of("jar", "jam", false),
            Arguments.of("jam", "jar", false),
            Arguments.of("a", "a", true),
            Arguments.of("a", "aa", false),
            Arguments.of("asd", "aa", false),
        )
    }
}