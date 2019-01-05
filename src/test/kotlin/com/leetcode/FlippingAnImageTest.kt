package com.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class FlippingAnImageTest {

  @Test
  fun `base input from leetcode`() {
    val solution = FlippingAnImage.Solution()
    val firstArray = intArrayOf(1, 1, 0)
    val secondArray = intArrayOf(1, 0, 1)
    val thirdArray = intArrayOf(0, 0, 0)
    val intArray = arrayOf(firstArray, secondArray, thirdArray)

    val expectedFirst = intArrayOf(1, 0, 0)
    val expectedSecond = intArrayOf(0, 1, 0)
    val expectedThird = intArrayOf(1, 1, 1)
    val expectedInt = arrayOf(expectedFirst, expectedSecond, expectedThird)
    Assertions.assertArrayEquals(expectedInt, solution.flipAndInvertImage(intArray))
  }
}