package Inheritance

open class Shape (val name: String){
    open fun area(){
        println("Area not defined")
    }
}

class Circle(val r: Double) : Shape(name = "Circle"){
      override fun area(){
        println(r * r * 3.142)
    }
}

class Rectangle(val width: Double, val height : Double) : Shape(name = "Rectangle"){
    override fun area(){
        println(height * width)
    }
}

fun main(){
    val circle = Circle(2.2)
    val rectangle = Rectangle(3.0, 4.0)
    circle.area()
    rectangle.area()
}