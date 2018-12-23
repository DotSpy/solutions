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

    fun charByCharSolutions(emails: Array<String>): Int {
      val actualEmails = mutableSetOf<String>()
      for (email in emails) {
        var i = 0
        val sb = StringBuilder()
        var foundPlus = false
        while (i < email.length) {
          val currentChar = email[i]
          if (currentChar == '@') {
            sb.append(email.substring(i))
            break
          } else if (currentChar == '.' && !foundPlus) {
            i++
          } else if (currentChar == '+' && !foundPlus) {
            foundPlus = true
          } else if (!foundPlus) {
            sb.append(currentChar)
            i++
          } else {
            i++
          }
        }
        actualEmails.add(sb.toString())
      }
      return actualEmails.size
    }

    private fun String.replaceAfterWithCharacter(delimiter: Char, replacement: String): String {
      val index = indexOf(delimiter)
      return replaceRange(index, length, replacement)
    }
  }

}