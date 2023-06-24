fun main() {
    val score = 62.5

    var grad: Char = 'F'

    if (score in 90.0..65.00) {
        grad = 'A'
    } else if (score in 60.0..65.0) {
        grad = 'c'

    }
    println(grad)
}


