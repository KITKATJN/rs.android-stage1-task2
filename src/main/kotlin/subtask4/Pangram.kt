package subtask4
import java.lang.*


class Pangram {

    // TODO: Complete the following function
    fun getResult(inputString: String): String {
        val vowels = arrayOf(
            'a', 'e', 'i', 'o', 'u', 'y',
            'A', 'E', 'I', 'O', 'U', 'Y'
        )
        val consonants = arrayOf(
            'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z',
            'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Z'
        )

        var lettersInWord =0
        if (inputString.isBlank())return ""
        var wordsInInputString = inputString.split(" ").filter { it != ""}.filter {it != "\n"}.map { StringBuilder(it) }.toMutableList()
        if (inputString.isPangram()) {
            wordsInInputString.forEachIndexed { i, it -> lettersInWord = 0
                it.forEachIndexed { j, symbol -> if (vowels.contains(symbol)){
                    wordsInInputString[i][j] = symbol.toUpperCase()
                    lettersInWord++ }
                }
                wordsInInputString[i] =StringBuilder("$lettersInWord${wordsInInputString[i]}");//добавляем к каждому слову количестов гласных в нем
            }
            wordsInInputString.sortBy { it[0] }//сортировка по количеству гласных букв
            return wordsInInputString.joinToString(" ")
        } else {
            wordsInInputString.forEachIndexed { i, it -> lettersInWord = 0
                it.forEachIndexed { j, symbol -> if (consonants.contains(symbol)){
                    wordsInInputString[i][j] = symbol.toUpperCase()
                    lettersInWord++ }
                }
                wordsInInputString[i] = StringBuilder("$lettersInWord${wordsInInputString[i]}");
            }
            wordsInInputString.sortBy { it[0] }//сортировка по количеству согласных букв
            return wordsInInputString.joinToString(" ")
        }
    }
      fun CharSequence.isBlank(): Boolean = length == 0 || indices.all { this[it].isWhitespace() }
     fun String.isPangram() : Boolean {
        val alphabet = arrayListOf('a', 'b', 'c', 'd', 'e', 'f',
            'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
            'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
            'w', 'x', 'y', 'z')
        this.toLowerCase().forEach { if (alphabet.contains(it)) alphabet.remove(it) }
        return alphabet.isEmpty()
    }

}
