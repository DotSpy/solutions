package com.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class RobotReturnToOriginTest {

  @Test
  fun `leetcode example test`() {
    val solution = RobotReturnToOrigin.Solution()
    Assertions.assertEquals(true, solution.judgeCircle("UD"))
    Assertions.assertEquals(true, solution.judgeCircle("LR"))
    Assertions.assertEquals(true, solution.judgeCircle("UDLR"))
    Assertions.assertEquals(false, solution.judgeCircle("UDD"))
    Assertions.assertEquals(false, solution.judgeCircle("UDR"))
  }
}