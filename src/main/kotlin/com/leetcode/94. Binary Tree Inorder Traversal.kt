package com.leetcode

import com.leetcode.model.TreeNode

class BinaryTreeInorderTraversal {

  class Solution {
    fun inorderTraversal(root: TreeNode?): List<Int> {
      if (root == null) {
        return emptyList()
      }
      return traverse(root, mutableListOf())
    }

    private fun traverse(root: TreeNode, result: MutableList<Int>): List<Int> {
      root.left?.let { left ->
        traverse(left, result)
      }
      result.add(root.`val`)
      root.right?.let { right ->
        traverse(right, result)
      }
      return result
    }
  }
}