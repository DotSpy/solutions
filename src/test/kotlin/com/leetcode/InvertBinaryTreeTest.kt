package com.leetcode

import com.leetcode.model.TreeNode
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class InvertBinaryTreeTest {

  @Test
  fun `base input leetcode`() {
    val solution = InvertBinaryTree.Solution()
    val tree = TreeNode().also { root ->
      root.`val` = 4
      root.left = TreeNode().apply {
        `val` = 2
        left = TreeNode().apply { `val` = 1 }
        right = TreeNode().apply { `val` = 3 }
      }
      root.right = TreeNode().apply {
        `val` = 7
        left = TreeNode().apply { `val` = 6 }
        right = TreeNode().apply { `val` = 9 }
      }
    }
    val expectedTree = TreeNode().also { root ->
      root.`val` = 4
      root.left = TreeNode().apply {
        `val` = 7
        left = TreeNode().apply { `val` = 9 }
        right = TreeNode().apply { `val` = 6 }
      }
      root.right = TreeNode().apply {
        `val` = 2
        left = TreeNode().apply { `val` = 3 }
        right = TreeNode().apply { `val` = 1 }
      }
    }
    Assertions.assertEquals(expectedTree, solution.invertTree(tree))
  }
}