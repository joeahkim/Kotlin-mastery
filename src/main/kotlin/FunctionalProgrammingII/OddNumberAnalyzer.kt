package FunctionalProgrammingII

class OddNumberAnalyzer {
}
fun List<Int>.averageOfOddNumbers(): Double{
    val oddNumbers = this.filter {
        it % 2 != 0
    }
    return if (oddNumbers.isNotEmpty()) oddNumbers.average() else 0.0
}
fun List<Int>.squaresOfOddNumbers(): List<Int>{
    return this.filter {
        it % 2 != 0
    }.flatMap { listOf(it * it) }
}

fun main() {
    val readNumbers = readln().split(" ").map { it.toInt() }
    val numbers = readNumbers

    println("Original list: $numbers")
    println("Odd numbers only: ${numbers.filter { it % 2 != 0 }}")
    println("Average of odd numbers: ${numbers.averageOfOddNumbers()}")
    println("Flattened list of odd numbers and their squares: ${numbers.squaresOfOddNumbers()}")
}