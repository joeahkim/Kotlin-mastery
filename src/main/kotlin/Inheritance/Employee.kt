package Inheritance

open class Employee(val name: String, val salary: Double) {
    open fun calculateBonus(){
        println("Bonus is 0.0")
    }
}

class Manager(name: String, salary: Double, val teamsize: Int) : Employee(name, salary){
    override fun calculateBonus() {
        println("$name earns $salary with a bonus of ${salary * 0.10 + teamsize * 50}\n")
    }
}

class Developer(name: String, salary: Double, val programmingLanguage: String) : Employee(name, salary){
    override fun calculateBonus() {
        println("$name earns $salary with a bonus of ${salary * 0.05}\n")
    }
}
fun main(){
    val developer = Developer("Joakim", 300.00, "Kotlin")
    val manager = Manager("Papa", 400.00, 3)
    developer.calculateBonus()
    manager.calculateBonus()
}