package CollectionsII.higherOrderFunctions

import kotlin.math.PI

//fun main(){
//    val numbers = listOf(1, 2, 3, 4, 5)
//    val doubled = numbers.map { it * 2 }
//
//    println(doubled)
//}

//squaring all even numbers only
fun main(){
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    val evenNumbers = numbers
        .filter { it % 2 == 0 }
        .map { it * it }
    println(evenNumbers)
}