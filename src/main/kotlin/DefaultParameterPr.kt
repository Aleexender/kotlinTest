fun main() {
    repeat("Hello")// 디폴트 파라메터 떄문에 num이랑 useNewLine을 안넣어줘도 됨
    repeat("Hello",5,false)
    repeat("Hello", useNewLine = false)

    printNameNSex("Female", "김정훈")
    printNameNSex(name = "김정훈", gender = "male")

}

fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print("놉")
        }
    }
}


fun printNameNSex(name: String, gender: String) {
    println(name)
    println(gender)
}