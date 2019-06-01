package com.leetcode

import com.leetcode.model.TreeNode
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class SymmetricTreeTest {

    @Test
    fun `leetcode symmetric example test`() {
        val input = TreeNode().also { root ->
            root.`val` = 1
            root.left = TreeNode().apply {
                `val` = 2
                left = TreeNode().apply { `val` = 3 }
                right = TreeNode().apply { `val` = 4 }
            }
            root.right = TreeNode().apply {
                `val` = 2
                left = TreeNode().apply { `val` = 4 }
                right = TreeNode().apply { `val` = 3 }
            }
        }
        val solution = SymmetricTree.Solution()
        Assertions.assertTrue(solution.isSymmetric(input))
    }

    @Test
    fun `leetcode asymmetric example test`() {
        val input = TreeNode().also { root ->
            root.`val` = 1
            root.left = TreeNode().apply {
                `val` = 2
                right = TreeNode().apply { `val` = 3 }
            }
            root.right = TreeNode().apply {
                `val` = 2
                right = TreeNode().apply { `val` = 3 }
            }
        }
        val solution = SymmetricTree.Solution()
        Assertions.assertFalse(solution.isSymmetric(input))
    }
}