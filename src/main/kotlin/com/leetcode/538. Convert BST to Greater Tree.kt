package com.leetcode

import com.leetcode.model.TreeNode

/**
Given a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is changed to the original key plus sum of all keys greater than the original key in BST.

Example:

Input: The root of a Binary Search Tree like this:
5
/   \
2     13

Output: The root of a Greater Tree like this:
18
/   \
20     13
 */
class ConvertBSTtoGreaterTree {

  class Solution {

    private var total = 0

    fun convertBST(root: TreeNode?): TreeNode? {
      if (root != null) {
        convertBST(root.right)
        total += root.`val`
        root.`val` = total
        convertBST(root.left)
      }
      return root
    }

  }
}