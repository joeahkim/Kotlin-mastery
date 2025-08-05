package CollectionsII.higherOrderFunctions

import kotlin.math.PI

//fun main(){
//    val numbers = listOf(1, 2, 3, 4, 5)
//    val doubled = numbers.map { it * 2 }
//
//    println(doubled)
//}

//squaring all even numbers only
//fun main(){
//    val numbers = listOf(1, 2, 3, 4, 5, 6)
//    val evenNumbers = numbers
//        .filter { it % 2 == 0 }
//        .map { it * it }
//    println(evenNumbers)
//}

//Keep only names starting with the letter "K"
//Capitalize them all
//fun main(){
//    val names = listOf("kim", "regina", "kyle", "faith", "derrick")
//    val contained = names
//        .filter { it.startsWith('k') }
//        .map { it.replaceFirstChar { char -> char.uppercaseChar()} }
//    println(contained)
//}

//group the names by their starting letter
fun main(){
    val names = listOf("Kim", "Kyle", "Regina", "Faith", "Derrick", "Rose", "Kelvin")
    val groupedNames = names
        .groupBy { it.first().uppercaseChar() }
        .toSortedMap()
    println(groupedNames)
}