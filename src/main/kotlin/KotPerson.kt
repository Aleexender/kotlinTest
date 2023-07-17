import java.util.InputMismatchException

fun main() {
    Singleton.a += 10
    println(Singleton.a)
}

class KotPerson private constructor(
    var name: String,
    var age: Int,
){
    companion object Factory{
        const val MIN_AGE = 1
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }
    }
}

object Singleton { // 싱글톤 생성 방법
    var a = 0;
}