package Inheritancce

fun main() {
    var a = IU("아이유",20)
    a.introduce()
    a.sing()
}


open class Celebrity(open var name: String, var age: Int, var type: String) {
    fun introduce(){
        println("저는 $name 이고, $age, $type 을 합니다")

    }

}

class IU(name: String, age: Int) : Celebrity(name, age, "가수") {
    fun sing(){
        println("룰루")
    }
}