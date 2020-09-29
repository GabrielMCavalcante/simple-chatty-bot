import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt().toDouble()
    println(Math.cbrt(num).toInt())
}