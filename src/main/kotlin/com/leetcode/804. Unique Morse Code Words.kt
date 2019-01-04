package com.leetcode

class UniqueMorseCodeWords {

  class Solution {

    private val morseTable = arrayOf(".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..")

    fun uniqueMorseRepresentations(words: Array<String>): Int {
      val resultSet = mutableSetOf<String>()
      words.forEach { word ->
        val stringBuilder = StringBuilder()
        word.toCharArray().forEach { char ->
          stringBuilder.append(morseTable[char - 'a'])
        }
        resultSet.add(stringBuilder.toString())
      }
      return resultSet.size
    }

    private fun getMorse(char: Char): String {
      return when (char) {
        'a' -> ".-"
        'b' -> "-..."
        'c' -> "-.-."
        'd' -> "-.."
        'e' -> "."
        'f' -> "..-."
        'g' -> "--."
        'h' -> "...."
        'i' -> ".."
        'j' -> ".---"
        'k' -> "-.-"
        'l' -> ".-.."
        'm' -> "--"
        'n' -> "-."
        'o' -> "---"
        'p' -> ".--."
        'q' -> "--.-"
        'r' -> ".-."
        's' -> "..."
        't' -> "-"
        'u' -> "..-"
        'v' -> "...-"
        'w' -> ".--"
        'x' -> "-..-"
        'y' -> "-.--"
        'z' -> "--.."
        else -> {
          throw IllegalArgumentException("No morse code for char = $char")
        }
      }
    }
  }

}