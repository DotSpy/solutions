package com.leetcode

/*
  APPROXIMATIVE OCR (Optical Character Recognition)

  We have a OCR software reading a text from an image.

  The software returns strings with the content read from the image.
  Unrecognized characters are replaced by interrogation marks such as:

    Apple      ->   A?p?e ( the "p" weren't recognized )

  Additionnally compression is applied.
  Consecutive interrogations marks are replaced by numbers:

    Apple     ->   ?????     ->   5
    Apple     ->   Apple     ->   Apple
    Apple     ->   A?p?e     ->   A1p1e
    Apple     ->   Ap?le     ->   Ap1le
    Apple     ->   Ap??e     ->   Ap2e
    Sandwich  ->   ???dwich  ->   3dwich

  Task : write a function to compare two compressed strings.

    boolean compare(String s1, String s2)

  It should return true if they could be the same word, false otherwise.

  Notes:
  - the original text contained in the image doesn't not contain digits nor question marks.
  - case matters: apple != Apple

*/

// To execute Kotlin code, please define a top level function named main
class DeliveryHeroTestTask {

    fun main(args: Array<String>) {
        println(compare("a3e", "1p2e") == true)
        println(compare("ar2e", "ap2e") == false)
    }

    //a###e
    //#p##e


    //TODO: Can be things like 32ap ?
    //ab##r
    //a##b#
    fun compare(s1: String, s2: String): Boolean {
        var s1Pointer = 0
        var s2Pointer = 0
        var s2UnrecognizedCharsSeq = 0
        var s1UnrecognizedCharsSeq = 0
        while (s1Pointer <= s1.length + 1 || s2Pointer <= s2.length + 1) {
            val s1Char = s1[s1Pointer]
            val s2Char = s2[s2Pointer]
            if (s1Char.isDigit()) {
                val s1Digit = s1Char.toString().toInt()
                s1UnrecognizedCharsSeq = s1[s1Pointer].toString().toInt() - 1
                for (i in 0 until s1Digit) {
                    if (s2Pointer > s1.length) {
                        return false
                    } else if (s2[s2Pointer].isDigit()) {
                        if (s2UnrecognizedCharsSeq <= 0) {
                            s2UnrecognizedCharsSeq = s2[s2Pointer].toString().toInt() - 1
                            s2Pointer++
                        } else if (s2UnrecognizedCharsSeq > 0) {
                            s2UnrecognizedCharsSeq--
                        } else {
                            s2Pointer++
                        }
                    } else {
                        s2UnrecognizedCharsSeq--
                        s2Pointer++
                    }
                }
                s1Pointer++
                continue
            } else if (s2Char.isDigit()) {
                val s2Digit = s2Char.toString().toInt()
                for (i in 0 until s2Digit) {
                    if (s1Pointer > s1.length) {
                        return false
                    } else if (s1[s1Pointer].isDigit()) {
                        if (s1UnrecognizedCharsSeq <= 0) {
                            s1UnrecognizedCharsSeq = s1[s1Pointer].toString().toInt() - 1
                            s1Pointer++
                        } else if (s1UnrecognizedCharsSeq > 0) {
                            s1UnrecognizedCharsSeq--
                        } else {
                            s1Pointer++
                        }
                    } else {
                        s1UnrecognizedCharsSeq--
                        s1Pointer++
                    }
                    s2Pointer++
                }
            } else if (s2Char != s1Char && s2UnrecognizedCharsSeq <= 0) {
                return false
            }
            continue
        }
        return true
    }
}