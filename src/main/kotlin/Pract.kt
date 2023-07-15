fun main() {
    calculate(1, 3)
    println(calculate(1,3))

}
fun calculate(a: Int, b: Int): Int {
    return if (a != b) {
        var result: Int = a+b
        result
    } else {
        a
    }


}