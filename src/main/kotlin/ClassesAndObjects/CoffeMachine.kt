package ClassesAndObjects

import javax.print.attribute.standard.MediaSize

//Has a brand and waterLevel (in milliliters).
//Can brewCoffee(size: Int) — deducts the water and prints a message.
//Can refillWater(amount: Int) — increases water level.
//If there’s not enough water to brew, it should warn the user.
class CoffeeMachine(val brand: String, var waterLevel: Int) {
    fun brewCoffee(size: Int) {
        if (size <= 0) {
            println("Coffee size must be greater than 0.")
        } else if (size > waterLevel) {
            println("Not enough water. Current water level: $waterLevel")
        } else {
            waterLevel -= size
            println("Brewing $size ml coffee... New water level is $waterLevel ml")
        }
    }

    fun refillWater(amount: Int) {
        if (amount > 0) {
            waterLevel += amount
            println("Refilled $amount ml. Current water level: $waterLevel ml")
        } else {
            println("Refill amount must be greater than 0.")
        }
    }
}