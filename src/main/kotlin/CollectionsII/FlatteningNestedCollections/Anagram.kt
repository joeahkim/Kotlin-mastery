package CollectionsII.FlatteningNestedCollections

fun main(){
    val words = listOf("bat", "tab", "tap", "pat", "cat", "act", "at")

    val groupedAnagrams = words.groupBy { it.toCharArray().sorted().joinToString("") }
    groupedAnagrams.values.forEach { println(it) }
}