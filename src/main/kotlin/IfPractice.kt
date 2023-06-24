import java.util.InputMismatchException
import kotlin.IllegalArgumentException


fun validateScore(score: Int) {
    if (score < 0) {
        throw IllegalArgumentException("$score 는 0보다 작을수 없다")
    }

    if (score !in 0..100) {
        throw IllegalArgumentException("범위는 0부터 100임 ")

    }

}

fun getPassOrFail(score: Int): String {
    if (score >= 50) {
        return "P"
    } else {
        return "F"
    }
}

fun testTest(score: Int): String {
    return if (score >= 50) {
        "p"
    } else {
        "F"
    }
}