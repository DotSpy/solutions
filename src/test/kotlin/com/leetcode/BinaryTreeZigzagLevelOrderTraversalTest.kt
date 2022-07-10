package com.leetcode

import com.leetcode.model.TreeNode
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class BinaryTreeZigzagLevelOrderTraversalTest {

  private val solution = BinaryTreeZigzagLevelOrderTraversal.Solution()
  //[3,9,20,null,null,15,7]
  @Test
  fun leetcodeExample1() {
    val tree = TreeNode().also { root ->
      root.`val` = 3
      root.left = TreeNode(9)
      root.right = TreeNode().apply {
        `val` = 20
        left = TreeNode().apply { `val` = 15 }
        right = TreeNode().apply { `val` = 7 }
      }
    }
    assertEquals(listOf(listOf(3), listOf(20, 9), listOf(15, 7)), solution.zigzagLevelOrder(tree))
  }
//[1,2,3,4,null,null,5]
  @Test
  fun leetcodeExample2() {
    val tree = TreeNode().also { root ->
      root.`val` = 1
      root.left = TreeNode(2).apply {
        left = TreeNode(4)
      }
      root.right = TreeNode(3).apply {
        left = TreeNode(5)
      }
    }
    assertEquals(listOf(listOf(1), listOf(3, 2), listOf(4, 5)), solution.zigzagLevelOrder(tree))
  }
}
