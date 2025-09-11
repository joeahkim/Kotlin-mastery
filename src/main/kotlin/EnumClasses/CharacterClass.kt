package EnumClasses

enum class CharacterClass(val constant: Int) {
    WARRIOR(50),
    MAGE(70),
    ARCHER(60),
    HEALER(30),
}
class Character(val name: String, val level: Int, val characterClass: CharacterClass){
    fun calculateAttackPower(): Int{
        val totalAttackPower = level * characterClass.constant
        return totalAttackPower
    }
}
fun main(){
    val character = Character("Aragon", 3, CharacterClass.WARRIOR)
    val character1 = Character("Elora", 5, CharacterClass.MAGE)
    val character2 = Character("Legolas", 4, CharacterClass.ARCHER)
    println("Name: ${character1.name} | Class: ${character1.characterClass} | Level: ${character1.level} | Attack Power: ${character1.calculateAttackPower()}")
    println("Name: ${character.name} | Class: ${character.characterClass} | Level: ${character.level} | Attack Power: ${character.calculateAttackPower()}")
    println("Name: ${character2.name} | Class: ${character2.characterClass} | Level: ${character2.level} | Attack Power: ${character2.calculateAttackPower()}")
}
