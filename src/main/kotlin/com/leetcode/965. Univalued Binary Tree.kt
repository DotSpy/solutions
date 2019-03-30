package com.leetcode

import com.leetcode.model.TreeNode

class UnivaluedBinaryTree {

  class Solution {
    fun isUnivalTree(root: TreeNode?): Boolean {
      /**canonical**/
      if (root == null) {
        return true
      }
      val left = (root.left == null || (root.left?.`val` == root.`val` && isUnivalTree(root.left)))
      val right = (root.right == null || (root.right?.`val` == root.`val` && isUnivalTree(root.right)))
      return left && right
    }

    fun `fast`(root: TreeNode?): Boolean {
      /**trying faster**/
      if (root == null) {
        return true
      }
      val left = root.left?.`val`
      val right = root.right?.`val`
      if (root.`val` == left && root.`val` == right) {
        return isUnivalTree(root.left) && isUnivalTree(root.right)
      } else if (left != right && left != null && right != null) {
        return false
      } else if (root.`val` == left) {
        return isUnivalTree(root.left)
      } else if (root.`val` == right) {
        return isUnivalTree(root.right)
      } else if (right == null && left == null) {
        return true
      }
      return false
    }
  }
}