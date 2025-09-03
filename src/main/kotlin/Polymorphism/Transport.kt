package Polymorphism

open class Transport (val name : String){
    open fun move(){
        println("The transport is moving")
    }
}
class Car( name: String) : Transport(name){
    override fun move() {
        println("The car $name is driving on the road.")
    }
}
class Plane(name: String) : Transport(name){
    override fun move() {
        println("The plane $name is flying in the sky.")
    }
}

class Boat(name: String) : Transport(name){
    override fun move() {
        println("The boat $name is sailing on water.")
    }
}

fun main(){
    val transport: List<Transport> = listOf(Car("Suzuki"), Plane("Boieng 475"), Boat("Surface 123"))

    for (transport in transport){
        transport.move()
    }
}