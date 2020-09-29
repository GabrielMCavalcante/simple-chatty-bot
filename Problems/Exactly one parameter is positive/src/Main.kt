import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val firstNumber = scanner.nextInt()
    val secondNumber = scanner.nextInt()
    val thirdNumber = scanner.nextInt()

    val firstCheck = firstNumber > 0
    val secondCheck = secondNumber > 0
    val thirdCheck = thirdNumber > 0

    val finalCheck = (firstCheck && !secondCheck && !thirdCheck)
            || (!firstCheck && secondCheck && !thirdCheck)
            || (!firstCheck && !secondCheck && thirdCheck)

    println(finalCheck)
}