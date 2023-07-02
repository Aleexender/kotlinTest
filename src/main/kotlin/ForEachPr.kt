import java.util.InputMismatchException

fun main() {

    val numbers = listOf(1, 2, 3)
    val nums = mutableListOf<Int>(1, 2, 3)
    nums.add(4)

    for (nu in nums) {
        println(nu)
    }


    for (number in numbers) {
        println(number)
    }

    var asd = 8;

    for (i in 1 until asd) { // 1,2,3,4,5,6,7 까지
        println(i)
    }

    for (i in 1..3) { // 1,2,3까지
    println(i)
    }

    for (i in 3 downTo 1) {
        println(i)
    }

    for (i in 1 .. 10 step 2) {
        println(i) // 1,3,5,7,9
    }

}