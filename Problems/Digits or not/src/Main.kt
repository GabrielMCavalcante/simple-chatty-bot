import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val firstChar = scanner.next().toString().first()
    val secondChar = scanner.next().toString().first()
    val thirdChar = scanner.next().toString().first()
    val fourthChar = scanner.next().toString().first()

    println("${firstChar.isDigit()}" +
            "\\${secondChar.isDigit()}" +
            "\\${thirdChar.isDigit()}" +
            "\\${fourthChar.isDigit()}")
}