import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val char = scanner.next().toString().first()

    println(char.isUpperCase() || char in '1'..'9')
}