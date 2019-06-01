package com.leetcode

import com.leetcode.model.TreeNode

class SymmetricTree {

    class Solution {
        fun isSymmetric(root: TreeNode?): Boolean = isSymmetricEquals(root?.left, root?.right)

        private fun isSymmetricEquals(left: TreeNode?, right: TreeNode?): Boolean {
            if (left == null && right == null) return true
            if (left == null || right == null) return false
            if (left.`val` != right.`val`) return false
            if (!isSymmetricEquals(left.left, right.right)) return false
            if (!isSymmetricEquals(left.right, right.left)) return false
            return true
        }
    }
}