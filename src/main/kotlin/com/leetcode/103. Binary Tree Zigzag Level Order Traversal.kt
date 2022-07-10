package com.leetcode

import com.leetcode.model.TreeNode
import java.util.*

/*
Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to right, then right to left for the next level and alternate between).



Example 1:

Input: root = [3,9,20,null,null,15,7]
Output: [[3],[20,9],[15,7]]

Example 2:

Input: root = [1]
Output: [[1]]

Example 3:

Input: root = []
Output: []

 */
class BinaryTreeZigzagLevelOrderTraversal {

  class Solution {

    fun zigzagLevelOrder(root: TreeNode?): List<List<Int>> {
      if (root == null) {
        return emptyList()
      }
      return zigZagTraverse(root, mutableListOf(), 0)
    }

    private fun zigZagTraverse(root: TreeNode, result: MutableList<LinkedList<Int>>, level: Int): List<List<Int>> {
      if (result.size == level) {
        result.add(level, LinkedList())
      }
      val nextLevel = level + 1
      if (level % 2 == 0) {
        result[level].add(root.`val`)
      } else {
        result[level].add(0, root.`val`)
      }
      root.left?.let { zigZagTraverse(it, result, nextLevel) }
      root.right?.let { zigZagTraverse(it, result, nextLevel) }
      return result
    }
  }
}
