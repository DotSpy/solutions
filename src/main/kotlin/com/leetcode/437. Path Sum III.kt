package com.leetcode

import com.leetcode.model.TreeNode

class PathSumIII {

    class Solution {

        private var numberOfPaths = 0

        fun pathSum(root: TreeNode?, sum: Int): Int {
            passTree(root, sum)
            return numberOfPaths
        }

        private fun passTree(root: TreeNode?, sum: Int) {
            if (root != null) {
                findPath(root, sum)
                passTree(root.left, sum)
                passTree(root.right, sum)
            }
        }

        private fun findPath(root: TreeNode?, sum: Int) {
            if (root != null) {
                val reminder = sum - root.`val`
                if (reminder == 0) {
                    numberOfPaths++
                }
                findPath(root.left, reminder)
                findPath(root.right, reminder)
            }
        }
    }
}