package com.leetcode

import com.leetcode.model.TreeNode

class MaximumDepthOfBinaryTree {

  class Solution {
    fun maxDepth(root: TreeNode?): Int {
      if (root == null) {
        return 0
      }
      val left = maxDepth(root.left)
      val right = maxDepth(root.right)
      return if (left > right) {
        left + 1
      } else {
        right + 1
      }
    }
  }
}