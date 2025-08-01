package CollectionsII

// Map is a collection that holds pairs of keys and values
// Key is a word while value is its definition
//fun calculateAverageManually(numbers: Collection<Int>): Double {
//    if (numbers.isEmpty()) {
//        return 0.0
//    }
//    var sum = 0.0
//    for (number in numbers) {
//        sum += number
//    }
//    return sum / numbers.size
//}
//fun main(){
//
//    val scores = mapOf(
//        "Kim" to 85,
//        "Regina" to 92,
//        "Derrick" to 74,
//        "Faith" to 66,
//        "Brian" to 90
//    )
//    val highest = scores.maxByOrNull { it.value }
//    println(highest)
//
//    val lowest = scores.minByOrNull { it.value }
//    println(lowest)
//
//    val averageScore = calculateAverageManually(scores.values)
//    println(averageScore)
//}
//
//fun main(){
//    val text = "Kotlin is fun and Kotlin is powerful and fun"
//
//    val wordCounts = mutableMapOf<String, Int>()
//    val words = text.split(" ")
//    for (i in words){
//        val toLowercase = i.lowercase()
//        wordCounts[toLowercase] = wordCounts.getOrDefault(toLowercase,0) + 1
//    }
//    for ((i, count) in wordCounts){
//        println("$i -> $count")
//    }
//}

fun main(){
    val grades = listOf(
        "A", "B", "C", "A", "C", "C"
    )
    val gradeCounts = mutableMapOf<String, Int>()
    for (i in grades){
        gradeCounts[i] = gradeCounts.getOrDefault(i, 0) + 1
    }
    for ((i, count) in gradeCounts){
//        println("${i.toSortedSet()} $count")
        if (count > 1){
            println("Grade ${i} $count Students")
        }else{
            println("Grade ${i} $count Student")
        }
    }
}