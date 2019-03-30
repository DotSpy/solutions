package com.leetcode

import com.leetcode.model.TreeNode
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class MaximumDepthOfBinaryTreeTest{

  @Test
  fun `leetcode example`(){
    val solution = MaximumDepthOfBinaryTree.Solution()
    val tree = TreeNode().also { root ->
      root.`val` = 3
      root.left = TreeNode().apply {
        `val` = 9
      }
      root.right = TreeNode().apply {
        `val` = 20
        left = TreeNode().apply { `val` = 15 }
        right = TreeNode().apply { `val` = 7 }
      }
    }
    Assertions.assertEquals(3, solution.maxDepth(tree))
  }
}