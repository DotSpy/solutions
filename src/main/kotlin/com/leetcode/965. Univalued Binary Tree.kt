package com.leetcode

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

class TreeNode(var `val`: Int = 0) {
  var left: TreeNode? = null
  var right: TreeNode? = null

  override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (javaClass != other?.javaClass) return false

    other as TreeNode

    if (`val` != other.`val`) return false
    if (left != other.left) return false
    if (right != other.right) return false

    return true
  }

  override fun hashCode(): Int {
    var result = `val`
    result = 31 * result + (left?.hashCode() ?: 0)
    result = 31 * result + (right?.hashCode() ?: 0)
    return result
  }


}