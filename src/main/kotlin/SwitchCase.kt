import java.util.InputMismatchException
import java.util.StringJoiner

fun getGrade(score: Int): String {
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }

}

fun getGrade2(score: Int): String {
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        else -> "D"
    }
}

fun startWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        is Int -> throw IllegalArgumentException("에러임")
        else -> false
    }
}

fun judgeNum(number: Int){
    when (number) {
        1, 0, -1 -> println("어디서 본거임")
        else -> println("숫자가 아님")
    }
}

fun judgeNum2(number: Int) {
    when {
        number == 0 -> println("0임")
        number % 2 == 0 -> println("주어진 숫자는 짝수")
        else -> println("홀수임")
    }
}