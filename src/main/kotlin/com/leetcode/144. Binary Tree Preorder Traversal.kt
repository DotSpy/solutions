package com.leetcode

import com.leetcode.model.TreeNode

class BinaryTreePreorderTraversal {

  class Solution {
    fun preorderTraversal(root: TreeNode?): List<Int> {
      if (root == null) {
        return emptyList()
      }
      return preorderTraversal(root, mutableListOf())
    }

    private fun preorderTraversal(root: TreeNode, traverse: MutableList<Int>): List<Int> {
      traverse.add(root.`val`)
      root.left?.let {
        preorderTraversal(it, traverse)
      }
      root.right?.let {
        preorderTraversal(it, traverse)
      }
      return traverse
    }
  }
}
