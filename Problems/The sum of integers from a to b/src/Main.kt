import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.next().toInt()
    val b = scanner.next().toInt()
    var sum = 0

    for (i in a..b) {
        sum += i
    }

    println(sum)
}