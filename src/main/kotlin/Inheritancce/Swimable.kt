package Inheritancce

interface Swimable {

    val swimAbility : Int
        get() = 3

    fun act(){
        println("어푸어푸")
        println(swimAbility)
    }

//    fun fly() //추상 메소드
}