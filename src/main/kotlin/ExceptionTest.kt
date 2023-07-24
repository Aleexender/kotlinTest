import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

fun parseInt(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 $str 은 숫자 아님")
    }
}

fun parseInt2(str: String): Int? {
    return try {
       str.toInt()
    } catch (e: NumberFormatException) {
        null
    }finally {
        println("몰랑")
    }
}

