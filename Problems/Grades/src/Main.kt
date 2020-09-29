import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var totalA = 0
    var totalB = 0
    var totalC = 0
    var totalD = 0

    val totalGrades = scanner.nextInt()

    repeat(totalGrades) {
        val currentGrade = scanner.nextInt()
        if (currentGrade == 2) {
            totalD++
        } else if (currentGrade == 3) {
            totalC++
        } else if (currentGrade == 4) {
            totalB++
        } else totalA++
    }

    println("$totalD $totalC $totalB $totalA")
}