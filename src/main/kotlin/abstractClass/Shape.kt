package abstractClass

abstract class Shape(val name : String) {
    abstract fun area() : Double
}
class Circle(val radius : Double, name: String) : Shape(name){
    override fun area(): Double {
        println("area of $name is ${3.142 * radius * radius}")
        return 3.142 * radius * radius
    }
}

class Rectangle(val width: Double, val height: Double, name: String) : Shape(name){
    override fun area(): Double {
        println("area of $name is ${width * height}")
        return width * height
    }
}

fun main(){
    val rect = Rectangle(4.0, 6.0, "My Rectangle")
    val circle = Circle(5.0 ,"My Circle")

    rect.area()
    circle.area()
}