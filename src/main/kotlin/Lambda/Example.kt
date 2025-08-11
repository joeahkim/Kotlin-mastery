package Lambda

// use a lambda with collection functions to find the maximum product of any two distinct numbers.
//fun main(){
//    val nums = listOf(3, 5, -2, 9, -8)
//    val sortedNums = nums.sorted()
//    val product1 = sortedNums.takeLast(2).reduce { a, b -> a * b }
//    val product2 = sortedNums.take(2).reduce { a, b -> a * b }
//
//    val maxProduct = maxOf(product1, product2)
//    println(maxProduct)
//}

//fun main(){
//    val words = listOf("Bat", "tab", "tap", "pat", "cat", "Act", "at", "At", "BAT")
//
//    val groupedAnagrams = words.distinct()
//        .groupBy { it.lowercase().toCharArray().sorted().joinToString("") }
//        .mapValues { (_, group) -> group.sorted() }
//        .values
//        .sortedBy { it.first().lowercase() }
//    println(groupedAnagrams)
//}

fun main() {
    val nums = listOf(112, 121, 211, 45, 54, 99, 909, -121)
    val sortedNums = nums
        .groupBy { Math.abs(it).toString().toCharArray().sorted().joinToString { "" }}
        .mapValues { (_,group) -> group.sorted() }
        .values
        .sortedBy { it.first() }
    println(sortedNums)
}


