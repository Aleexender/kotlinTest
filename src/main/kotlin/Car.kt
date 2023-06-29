import java.awt.datatransfer.ClipboardOwner

class Car(internal val name: String, private val owner: String, _price: Int) {

    var price = _price
        private set
}