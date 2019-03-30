package com.leetcode

import com.leetcode.model.TreeNode
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class DiameterOfBinaryTreeTest {

  @Test
  fun `leetcode example`() {
    val solution = DiameterOfBinaryTree.Solution()
    val tree = TreeNode().also { root ->
      root.`val` = 1
      root.left = TreeNode().apply {
        `val` = 2
        left = TreeNode().apply { `val` = 4 }
        right = TreeNode().apply { `val` = 5 }
      }
      root.right = TreeNode().apply {
        `val` = 3
      }
    }
    Assertions.assertEquals(3, solution.diameterOfBinaryTree(tree))
  }

  @Test
  fun `simple tree`() {
    val solution = DiameterOfBinaryTree.Solution()
    val tree = TreeNode().also { root ->
      root.`val` = 1
      root.left = TreeNode().apply {
        `val` = 2
      }
      root.right = TreeNode().apply {
        `val` = 3
      }
    }
    Assertions.assertEquals(2, solution.diameterOfBinaryTree(tree))
  }

  @Test
  fun `leetcode example 1 node`() {
    val solution = DiameterOfBinaryTree.Solution()
    val tree = TreeNode().also { root ->
      root.`val` = 1
    }
    Assertions.assertEquals(0, solution.diameterOfBinaryTree(tree))
  }

  @Test
  fun `leetcode example 2`() {
    val solution = DiameterOfBinaryTree.Solution()
    val tree = TreeNode().also { root ->
      root.`val` = 10
      root.left = TreeNode().apply {
        `val` = 9
      }
      root.right = TreeNode().apply {
        `val` = 15
        left = TreeNode().apply {
          `val` = 14
          left = TreeNode().apply {
            `val` = 13
            left = TreeNode().apply {
              `val` = 12
            }
          }
        }
        right = TreeNode().apply {
          `val` = 16
          right = TreeNode().apply {
            `val` = 17
            right = TreeNode().apply {
              `val` = 18
            }
          }
        }
      }
    }
    Assertions.assertEquals(6, solution.diameterOfBinaryTree(tree))
  }
}