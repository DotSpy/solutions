package com.leetcode

import com.leetcode.model.TreeNode

/**
Invert a binary tree.

Example:

Input:

4
/   \
2     7
/ \   / \
1   3 6   9
Output:

4
/   \
7     2
/ \   / \
9   6 3   1
Trivia:
This problem was inspired by this original tweet by Max Howell:

Google: 90% of our engineers use the software you wrote (Homebrew), but you can’t invert a binary tree on a whiteboard so f*** off.
 */
class InvertBinaryTree {

  class Solution {

    fun invertTree(root: TreeNode?): TreeNode? {
      val left = root?.left
      root?.left = root?.right
      root?.right = left
      if (root?.left != null) {
        invertTree(root.left)
      }
      if (root?.right != null) {
        invertTree(root.right)
      }
      return root
    }
  }
}