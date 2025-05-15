import com.leetcode.ValidSudoku
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class `ValidSudokuTest` {

    private val solution = ValidSudoku.Solution()

    @Test
    fun `leetcode example 1`() {
        val input = arrayOf(
            "53..7....".toCharArray(),
            "6..195...".toCharArray(),
            ".98....6.".toCharArray(),
            "8...6...3".toCharArray(),
            "4..8.3..1".toCharArray(),
            "7...2...6".toCharArray(),
            ".6....28.".toCharArray(),
            "...419..5".toCharArray(),
            "....8..79".toCharArray()
        )
        Assertions.assertTrue(solution.isValidSudoku(input))
    }

    @Test
    fun `leetcode example 2`() {
        val input = arrayOf(
            "83..7....".toCharArray(),
            "6..195...".toCharArray(),
            ".98....6.".toCharArray(),
            "8...6...3".toCharArray(),
            "4..8.3..1".toCharArray(),
            "7...2...6".toCharArray(),
            ".6....28.".toCharArray(),
            "...419..5".toCharArray(),
            "....8..79".toCharArray()
        )
        Assertions.assertFalse(solution.isValidSudoku(input))
    }
}