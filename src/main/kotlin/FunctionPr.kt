fun main() {
    printAll("A", "B", "C")

    val array = arrayOf("A", "B", "C")
//    printAll(*array)
}

fun max(a: Int, b: Int): Int {
    return if (a > b) {
        a
    } else {
        b
    }
}

fun max2(a: Int, b: Int) =
    if (a > b) {
        a
    } else {
        b
    }


fun max3(a: Int, b: Int) = if(a>b)a else b


fun printAll(vararg word: String) {
    for (str in word) {
        println(str)
    }
}