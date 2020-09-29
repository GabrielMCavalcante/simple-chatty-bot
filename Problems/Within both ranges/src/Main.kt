import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val firstRangeStart = scanner.nextInt()
    val firstRangeEnd = scanner.nextInt()
    val secondRangeStart = scanner.nextInt()
    val secondRangeEnd = scanner.nextInt()

    val number = scanner.nextInt()

    println(number in firstRangeStart..firstRangeEnd
            && number in secondRangeStart..secondRangeEnd)
}