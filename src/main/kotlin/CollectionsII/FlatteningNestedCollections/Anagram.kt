package CollectionsII.FlatteningNestedCollections

//fun main(){
//    val words = listOf("bat", "tab", "tap", "pat", "cat", "act", "at")
//
//    val groupedAnagrams = words.groupBy { it.toCharArray().sorted().joinToString("") }
//    groupedAnagrams.values.forEach { println(it) }
//}

// Group the words by their length, and within each group, sort them alphabetically.
fun main(){
    val words = listOf("cat", "to", "apple", "dog", "a", "banana", "bat", "an")
    val x = words.groupBy { it.length }
        .toSortedMap()
        .mapValues { it.value.sorted() }
    println(x.values.toList())
}