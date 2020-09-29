import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var maxNumberDivisibleByFour = 0

    val numbersListLength = scanner.nextInt()

    repeat(numbersListLength) {
        val currentNumber = scanner.nextInt()

        if (currentNumber % 4 == 0 && currentNumber > maxNumberDivisibleByFour) {
            maxNumberDivisibleByFour = currentNumber
        }
    }

    println(maxNumberDivisibleByFour)
}