fun main() {
    val dto = PersonDto("김정훈", 40)
    val dto2 = PersonDto("김상연", 40)
    println(dto)
}


data class PersonDto (
    val name: String,
    val age: Int
        ) {

}