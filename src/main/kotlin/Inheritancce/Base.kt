package Inheritancce


fun main() {
    Derived(300)
}
open class Base(open val number: Int = 100){ // 상위 클래스의 생성자 또는 초기화 블록에서 open 프로퍼티 사용하면 버그 생길수 있음
    init {
        println("base CL")
        println(number)
    }
}


class Derived(override val number: Int) : Base(number) {
    init {
        println("Derived CL")

    }
}