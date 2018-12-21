package com.leetcode

class UniqueEmailAddresses {

  class Solution {

    fun numUniqueEmails(emails: Array<String>): Int {
      val actualEmails = mutableSetOf<String>()
      for (email in emails) {
        val localName = email.substringBefore('@')
            .replace(".", "")
            .replaceAfterWithCharacter('+', "")
        val domainName = email.substringAfter('@')
        actualEmails.add(localName + domainName)
      }
      return actualEmails.size
    }

    private fun String.replaceAfterWithCharacter(delimiter: Char, replacement: String): String {
      val index = indexOf(delimiter)
      return replaceRange(index, length, replacement)
    }
  }

}