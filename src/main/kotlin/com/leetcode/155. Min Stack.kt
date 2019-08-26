package com.leetcode

import java.util.*

/*
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

    push(x) -- Push element x onto stack.
    pop() -- Removes the element on top of the stack.
    top() -- Get the top element.
    getMin() -- Retrieve the minimum element in the stack.

 */
class MinStack {

    private val stack = Stack<Element>()

    data class Element(
            val value: Int,
            val minimum: Int
    )

    fun push(x: Int) {
        if (stack.isNotEmpty()) {
            val element = stack.peek()
            if (x < element.minimum) {
                stack.push(Element(x, x))
            } else {
                stack.push(Element(x, element.minimum))
            }
        } else {
            stack.push(Element(x, x))
        }
    }

    fun pop() {
        stack.pop()
    }

    fun top(): Int {
        return stack.peek().value
    }

    fun getMin(): Int {
        return stack.peek().minimum
    }

}
