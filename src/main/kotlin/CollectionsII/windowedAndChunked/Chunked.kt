package CollectionsII.windowedAndChunked

//fun main(){
//    val students = listOf("Kim", "Regina", "Faith", "Derrick", "John", "Mary", "Paul")
//    val chunkedStudents = students.chunked(3)
//    chunkedStudents.forEachIndexed { index, chunk ->  println("Group ${index + 1}: $chunk")}
//}

//Split the scores into chunks of 4 students each.
//For each chunk, calculate the average score.
//Output a list of results where each item is in the format:"Chunk X average: Y"
fun main() {
    val scores = listOf(85, 92, 76, 88, 95, 63, 79, 84, 91, 73, 99, 68)

    val results = scores.chunked(4)
        .mapIndexed { index, chunk -> "${index + 1}: $chunk ${chunk.average()}" }
    println(results)
}
