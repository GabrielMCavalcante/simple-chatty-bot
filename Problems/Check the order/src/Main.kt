import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val N = scanner.next().toInt()
    var isSorted = "YES"
    var previousNumber = 0

    for (i in 1..N) {
        val currentNumber = scanner.nextInt()
        if (currentNumber >= previousNumber) {
            previousNumber = currentNumber
        } else isSorted = "NO"
    }

    println(isSorted)
}