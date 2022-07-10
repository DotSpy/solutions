package com.leetcode

import com.leetcode.model.TreeNode

class BinaryTreePostorderTraversal {

  class Solution {
    fun postorderTraversal(root: TreeNode?): List<Int> {
      if (root == null) {
        return emptyList()
      }
      return postorderTraversal(root, mutableListOf())
    }

    private fun postorderTraversal(root: TreeNode, travers: MutableList<Int>): List<Int> {
      root.left?.let {
        postorderTraversal(it, travers)
      }
      root.right?.let {
        postorderTraversal(it, travers)
      }
      travers.add(root.`val`)
      return travers
    }
  }
}
