package com.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class UniqueEmailAddressesTest {

  @Test
  fun `base input from leetcode`() {
    val solution = UniqueEmailAddresses.Solution()
    val inputEmailsArray = arrayOf("test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com")
    Assertions.assertEquals(2, solution.numUniqueEmails(inputEmailsArray))
  }
}