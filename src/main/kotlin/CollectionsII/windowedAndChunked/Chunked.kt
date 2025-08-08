package CollectionsII.windowedAndChunked

fun main(){
    val students = listOf("Kim", "Regina", "Faith", "Derrick", "John", "Mary", "Paul")
    val chunkedStudents = students.chunked(3)
    chunkedStudents.forEachIndexed { index, chunk ->  println("Group ${index + 1}: $chunk")}
}