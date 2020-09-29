import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val firstLetter = scanner.next().first()
    val secondLetter = scanner.next().first()

    println(firstLetter.toLowerCase() == secondLetter.toLowerCase())
}