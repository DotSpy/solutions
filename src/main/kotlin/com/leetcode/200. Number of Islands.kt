package com.leetcode

class NumberOfIslands {

  class Solution {

    fun numIslands(grid: Array<CharArray>): Int {
      val visited = grid.clone()
      var result = 0
      for (i in 0..grid.lastIndex) {
        for (j in 0..grid[0].lastIndex) {
          if (grid[i][j] == '1' && visited[i][j] == '1') {
            result++
            markIsland(visited, i, j)
          }
        }
      }
      return result
    }

    private fun markIsland(visited: Array<CharArray>, i: Int, j: Int) {
      if (i < 0 || i > visited.lastIndex || j < 0 || j > visited[0].lastIndex || visited[i][j] != '1') {
        return
      } else {
        visited[i][j] = '0'
        markIsland(visited, i + 1, j)
        markIsland(visited, i - 1, j)
        markIsland(visited, i, j + 1)
        markIsland(visited, i, j - 1)
      }
    }
  }
}
