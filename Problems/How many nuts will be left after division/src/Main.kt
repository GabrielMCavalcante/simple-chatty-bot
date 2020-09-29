import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val squirrels = scanner.next().toInt()
    val nuts = scanner.next().toInt()

    val leftoverNuts = nuts % squirrels

    println(leftoverNuts)
}