import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val number = scanner.nextInt()

    val rangeStart = scanner.nextInt()
    val rangeEnd = scanner.nextInt()

    println(number in rangeStart..rangeEnd)
}