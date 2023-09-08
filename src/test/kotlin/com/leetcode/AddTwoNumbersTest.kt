package com.leetcode

import com.leetcode.model.ListNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AddTwoNumbersTest {

    private val solution = AddTwoNumbers.Solution()

    @Test
    fun `leetcode example1`() {
        val first = ListNode(2).apply {
            next = ListNode(4).apply {
                next = ListNode(3)
            }
        }
        val second = ListNode(5).apply {
            next = ListNode(6).apply {
                next = ListNode(4)
            }
        }
        val expected = ListNode(7).apply {
            next = ListNode(0).apply {
                next = ListNode(8)
            }
        }
        assertEquals(expected, solution.addTwoNumbers(first, second))
    }

    @Test
    fun `leetcode example2`() {
        val first = ListNode(2).apply {
            next = ListNode(4).apply {
                next = ListNode(9)
            }
        }
        val second = ListNode(5).apply {
            next = ListNode(6).apply {
                next = ListNode(4).apply {
                    next = ListNode(9)
                }
            }
        }
        val expected = ListNode(7).apply {
            next = ListNode(0).apply {
                next = ListNode(4).apply {
                    next = ListNode(0).apply {
                        next = ListNode(1)
                    }
                }
            }
        }
        assertEquals(expected, solution.addTwoNumbers(first, second))
    }

    @Test
    fun `leetcode example3`() {
        val first = ListNode(0)
        val second = ListNode(0)
        val expected = ListNode(0)
        assertEquals(expected, solution.addTwoNumbers(first, second))
    }

//    @Test
//    fun `leetcode example4`() {
//        val first = ListNode(9)
//        val second = ListNode(9).apply {
//            next = ListNode(9).apply {
//                next = ListNode(9).apply {
//                    next = ListNode(9).apply {
//                        next = ListNode(9).apply {
//                            next = ListNode(9).apply {
//                                next = ListNode(9).apply {
//                                    next = ListNode(9).apply {
//                                        next = ListNode(9).apply {
//                                            next = ListNode(1)
//                                        }
//                                    }
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        val expected = ListNode(1).apply {
//            next = ListNode(9).apply {
//                next = ListNode(9).apply {
//                    next = ListNode(9).apply {
//                        next = ListNode(9).apply {
//                            next = ListNode(9).apply {
//                                next = ListNode(9).apply {
//                                    next = ListNode(9).apply {
//                                        next = ListNode(9).apply {
//                                            next = ListNode(0)
//                                        }
//                                    }
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        assertEquals(expected, solution.addTwoNumbers(first, second))
//    }

}