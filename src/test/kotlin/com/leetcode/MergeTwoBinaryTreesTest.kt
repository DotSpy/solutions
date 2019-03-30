package com.leetcode

import com.leetcode.model.TreeNode
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class MergeTwoBinaryTreesTest {

  @Test
  fun `leetcode example`() {
    val solution = MergeTwoBinaryTrees.Solution()
    val tree1 = TreeNode().also { root ->
      root.`val` = 1
      root.left = TreeNode().apply {
        `val` = 3
        left = TreeNode().apply { `val` = 5 }
      }
      root.right = TreeNode().apply { `val` = 2 }
    }
    val tree2 = TreeNode().also { root ->
      root.`val` = 2
      root.left = TreeNode().apply {
        `val` = 1
        right = TreeNode().apply { `val` = 4 }
      }
      root.right = TreeNode().apply {
        `val` = 3
        right = TreeNode().apply { `val` = 7 }
      }
    }
    val expectedTree = TreeNode().also {root ->
      root.`val` = 3
      root.left = TreeNode().apply {
        `val` = 4
        left = TreeNode().apply { `val` = 5 }
        right = TreeNode().apply { `val` = 4 }
      }
      root.right = TreeNode().apply {
        `val` = 5
        right = TreeNode().apply { `val` = 7 }
      }
    }
    Assertions.assertEquals(expectedTree, solution.mergeTrees(tree1, tree2))
  }
}