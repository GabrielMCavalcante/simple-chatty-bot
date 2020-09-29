import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val x1 = scanner.nextInt()
    val y1 = scanner.nextInt()

    val x2 = scanner.nextInt()
    val y2 = scanner.nextInt()

    println(
            if (x1 - 1 == x2 || x1 + 1 == x2) {
                if (y1 - 2 == y2 || y1 + 2 == y2) {
                    "YES"
                } else {
                    "NO"
                }
            } else if (x1 - 2 == x2 || x1 + 2 == x2) {
                if (y1 - 1 == y2 || y1 + 1 == y2) {
                    "YES"
                } else {
                    "NO"
                }
            } else "NO"
    )
}