package CollectionsII

// Map is a collection that holds pairs of keys and values
// Key is a word while value is its definition
fun calculateAverageManually(numbers: Collection<Int>): Double {
    if (numbers.isEmpty()) {
        return 0.0
    }
    var sum = 0.0
    for (number in numbers) {
        sum += number
    }
    return sum / numbers.size
}
fun main(){

    val scores = mapOf(
        "Kim" to 85,
        "Regina" to 92,
        "Derrick" to 74,
        "Faith" to 66,
        "Brian" to 90
    )
    val highest = scores.maxByOrNull { it.value }
    println(highest)

    val lowest = scores.minByOrNull { it.value }
    println(lowest)

    val averageScore = calculateAverageManually(scores.values)
    println(averageScore)
}