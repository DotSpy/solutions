package com.neetcode

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertEquals


class `Valid PalindromeTest` {

    @ParameterizedTest
    @MethodSource("dataProvider")
    fun firstExample(s: String, expected: Boolean) {
        assertEquals(expected, `Valid Palindrome`.Solution().isPalindrome(s))
    }

    companion object {
        @JvmStatic
        fun dataProvider(): Stream<Arguments> = Stream.of(
            Arguments.of("Was it a car or a cat I saw?", true),
            Arguments.of("tab a cat", false),
            Arguments.of("", true),
            Arguments.of("!", true),
            Arguments.of("aa", true),
            Arguments.of("asa!", true),
            Arguments.of("aaa", true),
        )
    }
}