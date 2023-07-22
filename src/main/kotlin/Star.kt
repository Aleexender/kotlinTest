import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val num: Int = scanner.nextInt()

    for (i in 1 .. num) {
        for (k in 1 .. i) {
            print("*")
        }
        println()
    }
}