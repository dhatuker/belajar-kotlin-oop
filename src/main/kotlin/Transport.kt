abstract class Transport(var weight: Float, var capacity: String, var speed: Float) {

    abstract fun default() : String
    //dah prinsip polimorfisme soalnya methodnya dirubah jadi bermacam bentuk
    abstract fun ship() : String

    fun load(){
        println("Goods are loaded successfully")
    }
    fun unload() {
        println("Goods are unloaded successfully")
    }
}