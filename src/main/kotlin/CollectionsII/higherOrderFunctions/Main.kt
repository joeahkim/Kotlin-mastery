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
//fun main(){
//    val names = listOf("Kim", "Kyle", "Regina", "Faith", "Derrick", "Rose", "Kelvin")
//    val groupedNames = names
//        .groupBy { it.first().uppercaseChar() }
//        .toSortedMap()
//    println(groupedNames)
//}

// Group people by city, and print how many live in each.
//fun main(){
//    val people = listOf(
//        "Kim" to "Nairobi",
//        "Regina" to "Kisumu",
//        "Derrick" to "Nairobi",
//        "Faith" to "Mombasa",
//        "Brian" to "Kisumu"
//    )
//    val groupedPeople = people.groupBy { it.second }
//        .mapValues { it.value }
//        .toSortedMap()
//    for ((x, y) in groupedPeople) {
//        println("$x → ${y.map { it.first }} ${y.size}")
//    }
//
//}

//fun main(){
//    val orders = listOf(
//        "Kim" to "Pending",
//        "Regina" to "Shipped",
//        "Derrick" to "Pending",
//        "Faith" to "Delivered",
//        "Brian" to "Pending",
//        "Ivy" to "Delivered"
//    )
//
//    val order = orders
//        .groupBy { it.second }
//        .toSortedMap()
//
//    for ((x, y) in order){
//        val names = y.map { it.first }
//        val count = names.size
//        val label = if (count == 1) "order" else "orders"
//        println("$x ->  $count $label $names")
//    }
//}

fun main(){
    val sales = listOf(
        "Kim" to "Electronics",
        "Regina" to "Groceries",
        "Derrick" to "Electronics",
        "Faith" to "Fashion",
        "Brian" to "Groceries",
        "Ivy" to "Fashion",
        "Zara" to "Electronics"
    )
    val sortedSales = sales
        .groupBy { it.second }
        .toSortedMap()
    for ((x, y) in sortedSales){
        val mapped = y.map { it.first }
        val count = mapped.size
        val label = if (count == 1) "sale" else "sales"

        println("${x} -> $count ${label}: $mapped")
    }
}