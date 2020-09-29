import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()
    val firstDigit = number / 100
    val secondDigit = number / 10 - firstDigit * 10
    val thirdDigit = number - "${firstDigit}${secondDigit}0".toInt()

    println("${thirdDigit,secondDigit,firstDigit}".toInt())
}
