import java.util.*
import kotlin.math.abs

fun getLastDigit(number: Int): Int {
    val withoutLastDigit = abs(number / 10 * 10)
    return abs(number) - withoutLastDigit
}

/* Do not change code below */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    println(getLastDigit(a))
}