package CollectionsII.higherOrderFunctions

//Combine all scores per student.
//Calculate the average score for each student.
//Find and print the name(s) of the student(s) with the highest average score
fun main(){
    val testScores = listOf(
        "Kim" to 90,
        "Regina" to 85,
        "Kim" to 95,
        "Derrick" to 88,
        "Faith" to 90,
        "Regina" to 95,
        "Faith" to 100
    )
    val combinedScorePerStudent = testScores.groupBy { it.first }
        for ((i, j) in combinedScorePerStudent) {
            println(i)
            println(j.sumOf { it.second })
            val average = if (j.isNotEmpty()) j.sumOf { it.second } / j.size else println("Stopped")
            println("Average is: ${average}")
            val highestAverage = j.maxByOrNull { it.second }
            println(highestAverage)
        }
}