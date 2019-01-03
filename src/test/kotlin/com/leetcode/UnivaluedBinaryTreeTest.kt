package com.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

internal class UnivaluedBinaryTreeTest {

  @ParameterizedTest
  @MethodSource("treesAndExpectedResults")
  fun `base input from leetcode`(tree: TreeNode?, expected: Boolean) {
    val solution = UnivaluedBinaryTree.Solution()
    Assertions.assertEquals(expected, solution.isUnivalTree(tree))
  }

  @Test
  fun `1 leaf`() {
    val solution = UnivaluedBinaryTree.Solution()
    val tree = TreeNode(1)
    val left = TreeNode(1)
    tree.left = left
    Assertions.assertEquals(true, solution.isUnivalTree(tree))
  }

  companion object {
    @JvmStatic
    @Suppress("unused")
    fun treesAndExpectedResults(): Stream<Arguments> {
      val firstRoot = TreeNode(1)
      val firstLeaf = TreeNode(1)
      firstRoot.left = firstLeaf
      firstRoot.right = firstLeaf
      firstLeaf.right = TreeNode(1)
      firstLeaf.left = null
      val secondRoot = TreeNode(2)
      val secondLeaf = TreeNode(2)
      secondRoot.left = secondLeaf
      secondRoot.right = secondLeaf
      secondLeaf.right = TreeNode(5)
      secondLeaf.left = TreeNode(2)
      return Stream.of(
          Arguments.arguments(firstRoot, true),
          Arguments.arguments(secondLeaf, false))
    }
  }
}