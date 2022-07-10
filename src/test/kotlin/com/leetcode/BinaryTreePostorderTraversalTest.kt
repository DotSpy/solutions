package com.leetcode

import com.leetcode.model.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class BinaryTreePostorderTraversalTest {

  private val solution = BinaryTreePostorderTraversal.Solution()

  @Test
  fun `leetcode example1`() {
    val tree = TreeNode().also { root ->
      root.`val` = 1
      root.right = TreeNode().apply {
        `val` = 2
        left = TreeNode().apply { `val` = 3 }
      }
    }
    assertEquals(listOf(3, 2, 1), solution.postorderTraversal(tree))
  }

  @Test
  fun `leetcode example2`() {
    val solution = BinaryTreeInorderTraversal.Solution()
    assertEquals(emptyList<Int>(), solution.inorderTraversal(null))
  }

  @Test
  fun `leetcode example3`() {
    val solution = BinaryTreeInorderTraversal.Solution()
    val tree = TreeNode().also { root ->
      root.`val` = 1
    }
    assertEquals(listOf(1), solution.inorderTraversal(tree))
  }

  @Test
  fun `leetcode example4`() {
    val solution = BinaryTreeInorderTraversal.Solution()
    val tree = TreeNode().also { root ->
      root.`val` = 1
      root.right = TreeNode().apply {
        `val` = 2
      }
    }
    assertEquals(listOf(1, 2), solution.inorderTraversal(tree))
  }
}
