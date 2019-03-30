package com.leetcode

import com.leetcode.model.TreeNode
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class ConvertBSTtoGreaterTreeTest {

  @Test
  fun `leetcode base input`() {
    val solution = ConvertBSTtoGreaterTree.Solution()
    val tree = TreeNode().also { root ->
      root.`val` = 5
      root.left = TreeNode().apply {
        `val` = 2
      }
      root.right = TreeNode().apply {
        `val` = 13
      }
    }
    val expectedTree = TreeNode().apply {
      `val` = 18
      left = TreeNode().apply { `val` = 20 }
      right = TreeNode().apply { `val` = 13 }
    }
    Assertions.assertEquals(expectedTree, solution.convertBST(tree))
  }

  @Test
  fun `leetcode example 1`() {
    val solution = ConvertBSTtoGreaterTree.Solution()
    val tree = TreeNode().also { root ->
      root.`val` = 2
      root.left = TreeNode().apply {
        `val` = 1
      }
      root.right = TreeNode().apply {
        `val` = 3
      }
    }
    val expectedTree = TreeNode().apply {
      `val` = 5
      left = TreeNode().apply { `val` = 6 }
      right = TreeNode().apply { `val` = 3 }
    }
    Assertions.assertEquals(expectedTree, solution.convertBST(tree))
  }
}