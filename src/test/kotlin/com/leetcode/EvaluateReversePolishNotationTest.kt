package com.leetcode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class EvaluateReversePolishNotationTest {

  private val solution = EvaluateReversePolishNotation.Solution()

  @Test
  fun leetcodeExample1() {
    assertEquals(9, solution.evalRPN(arrayOf("2","1","+","3","*")))
  }

  @Test
  fun leetcodeExample2() {
    assertEquals(6, solution.evalRPN(arrayOf("4","13","5","/","+")))
  }

  @Test
  fun leetcodeExample3() {
    assertEquals(22, solution.evalRPN(arrayOf("10","6","9","3","+","-11","*","/","*","17","+","5","+")))
  }
}
