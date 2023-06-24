import java.lang.IllegalArgumentException

fun main() {
    val str: String? = null
//    println(str?.length ?: 0)

    println(startWithA2(null))
    println(startWithA3(null))
    println(startsWith(null))
}

fun startsWithA1(str :String?): Boolean {
    return str?.startsWith("A") ?: throw IllegalArgumentException("null 이왔음")
}
fun startWithA2(str:String?): Boolean?{
    return str?.startsWith("A")
//    if (str == null) {
//        return null
//    }
//    return str.startsWith("A")
}

fun startWithA3(str:String?): Boolean{
    return str?.startsWith("A") ?: false

//    if (str == null) {
//        return false
//    }
//    return str.startsWith("A")
}

fun startsWith(str: String?): Boolean {
    return str!!.startsWith("A")
}