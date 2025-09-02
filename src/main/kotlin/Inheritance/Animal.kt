package Inheritance

//create a base class Animal with a method makeSound()
//create two child classes Dog and Cat that each print different sounds
open class Animal(val name: String) {
    open fun makeSound() {
        println("$name makes a sound.")
    }
}

class Dog(name: String) : Animal(name) {
    override fun makeSound() {
        println("$name says: Woof! Woof!")
    }
}

class Cat(name: String) : Animal(name) {
    override fun makeSound() {
        println("$name says: Meow! Meow!")
    }
}

class Bird(name: String) : Animal(name){

    override fun makeSound(){
        println("$name says: chirp! chirp!")
    }
}

fun main() {
    val dog = Dog("Buddy")
    val cat = Cat("Whiskers")
    val bird = Bird("Timmy")

    dog.makeSound()
    cat.makeSound()
    bird.makeSound()
}
