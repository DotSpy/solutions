package com.leetcode

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class MergeSortedArrayTest {

  private val solution = MergeSortedArray.Solution()

  @Test
  fun leetcodeExample1() {
    val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
    solution.merge(nums1, 3, intArrayOf(2, 5, 6), 3)
    assertArrayEquals(intArrayOf(1, 2, 2, 3, 5, 6), nums1)
  }

  @Test
  fun leetcodeExample2() {
    val nums1 = intArrayOf(1)
    solution.merge(nums1, 1, intArrayOf(), 0)
    assertArrayEquals(intArrayOf(1), nums1)
  }

  @Test
  fun leetcodeExample3() {
    val nums1 = intArrayOf(0)
    solution.merge(nums1, 0, intArrayOf(1), 1)
    assertArrayEquals(intArrayOf(1), nums1)
  }

  @Test
  fun leetcodeExample4() {
    val nums1 = intArrayOf(2, 0)
    solution.merge(nums1, 1, intArrayOf(1), 1)
    assertArrayEquals(intArrayOf(1, 2), nums1)
  }
}
