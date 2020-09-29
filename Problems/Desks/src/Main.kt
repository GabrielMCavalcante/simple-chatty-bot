import java.util.Scanner
import kotlin.math.ceil

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val firstGroup = scanner.next().toInt()
    val secondGroup = scanner.next().toInt()
    val thirdGroup = scanner.next().toInt()

    val firstGroupDesks = ceil(firstGroup.toDouble() / 2).toInt()
    val secondGroupDesks = ceil(secondGroup.toDouble() / 2).toInt()
    val thirdGroupDesks = ceil(thirdGroup.toDouble() / 2).toInt()

    val totalDesks = firstGroupDesks + secondGroupDesks + thirdGroupDesks
    println(totalDesks)
}