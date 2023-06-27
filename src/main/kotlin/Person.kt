import java.lang.IllegalArgumentException

fun main() {
    val person = Person("alex",1000)
    val person2 = Person("rex")

    println(person.name)
    person.age = 10
    println(person.age)

    println(person2.name)
    println(person2.age)

}

public class Person(val name: String, var age: Int) { // 여기에 생성자 추가

    init { // 클래스가 초기화되는 시점에 한 번 호출되는 블록
        if (age <= 0) {
            throw IllegalArgumentException("나이는 $age 일수 없다")
        }
    }
    constructor(name: String): this(name, 1) {// 주 생성자를 부름
        println("부생성자 1")
    }
    constructor(): this("홍길동"){// 1번쨰 생성자 를 부름
        println("부생성자 2")
    }
}
