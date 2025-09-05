package Interfaces

interface Switchable{
    fun turnOn()
    fun turnOff()
}

interface Adjustable{
    fun adjust(setting : Int)
}

class Light : Switchable{
    override fun turnOn() {
        println("Light is now ON")
    }

    override fun turnOff() {
        println("Light is now Off")
    }
}
class Thermostat() : Switchable, Adjustable{
    override fun turnOn() {
        println("Thermostat is now ON")
    }

    override fun turnOff() {
        println("Thermostat is now OFF")
    }

    override fun adjust(setting: Int) {
        println("Thermostat temperature adjusted to $setting")
    }
}

class Speaker : Switchable, Adjustable{
    override fun turnOn() {
        println("Speaker is now ON")
    }

    override fun turnOff() {
        println("Speaker is now OFF")
    }

    override fun adjust(setting: Int) {
        println("Speaker Volume adjusted to $setting")
    }
}

fun main(){
    val devices : List<Switchable> = listOf(Light(),
        Thermostat(),
        Speaker())
    for (i in devices){
        i.turnOn()
        if (i is Adjustable){
           val setting = when(i){
               is Thermostat -> 22
               is Speaker -> 10
               else -> 0
           }
            i.adjust(setting)
        }
    }
    for (i in devices){
        i.turnOff()
    }
}