package CollectionsII.FlatteningNestedCollections

//fun main(){
//    val words = listOf("bat", "tab", "tap", "pat", "cat", "act", "at")
//
//    val groupedAnagrams = words.groupBy { it.toCharArray().sorted().joinToString("") }
//    groupedAnagrams.values.forEach { println(it) }
//}

// Group the words by their length, and within each group, sort them alphabetically.
//fun main(){
//    val words = listOf("cat", "to", "apple", "dog", "a", "banana", "bat", "an")
//    val x = words.groupBy { it.length }
//        .toSortedMap()
//        .mapValues { it.value.sorted() }
//    println(x.values.toList())
//}

//Count how many words start with each letter
//fun main(){
//    val words = listOf("apple", "banana", "apricot", "blueberry", "cherry", "avocado", "carrot")
//    val x = words.groupBy { it.first() }.mapValues { it.value.size }
//    println(x)
//}

fun main(){
    val words = listOf("i", "love", "kotlin", "i", "code", "love", "code", "code")
    val k = 2
    val x = words.groupingBy { it }.eachCount().toSortedMap()
    println(x)

}