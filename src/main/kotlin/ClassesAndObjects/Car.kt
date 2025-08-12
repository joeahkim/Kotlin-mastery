package ClassesAndObjects

class Car(val brand: String?, var speed: Int = 0) {
    fun accelerate(amount: Int) {
        if (amount > 0) {
            speed += amount
            if (speed > 0){
                println("Moving")
                if(speed > 180){
                    println("Slow Down Buddy")
                }
            }else{
                println("Parked")
            }
        }
    }

    fun getDetails(): String {
        return "${brand ?: "Unknown brand"} at $speed km/h"
    }
}

fun main() {
    val car1 = Car("Toyota", 0)
    val car2 = Car(null, 0)

    car1.accelerate(250)
    car2.accelerate(30)

    println(car1.getDetails())
    println(car2.getDetails())
}