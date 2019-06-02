package com.leetcode

import com.leetcode.model.TreeNode
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class PathSumIIITest {
    /*
          10
         /  \
        5   -3
       / \    \
      3   2   11
     / \   \
    3  -2   1
     */
    @Test
    fun `leetcode test example`() {
        val input = TreeNode().also { root ->
            root.`val` = 10
            root.left = TreeNode().apply {
                `val` = 5
                left = TreeNode().apply {
                    `val` = 3
                    left = TreeNode().apply {
                        `val` = 3
                    }
                    right = TreeNode().apply {
                        `val` = -2
                    }
                }
                right = TreeNode().apply {
                    `val` = 2
                    right = TreeNode().apply {
                        `val` = 1
                    }
                }
            }
            root.right = TreeNode().apply {
                `val` = -3
                right = TreeNode().apply { `val` = 11 }
            }
        }
        val solution = PathSumIII.Solution()
        Assertions.assertEquals(3, solution.pathSum(input, 8))
    }
}