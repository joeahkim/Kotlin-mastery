package CollectionsII.ZippingAndUnzipping

//fun main(){
//    val names = listOf("Kim", "Regina", "Derrick")
//    val scores = listOf(90, 85, 95)
//    val x = names.zip(scores){ names, scores ->
//        "$names -> $scores"
//    }.sortedByDescending { it }
//    println(x)
//}

fun main(){
    val studentData = listOf(
        "Kim" to 90,
        "Regina" to 95,
        "Derrick" to 85,
        "Faith" to 95
    )
    val (name, score) = studentData.unzip()
    println("name: $name")
    println("Scores: $score")
    println("Average Score: ${score.average()}")
    println("Top Scores: ${studentData.maxByOrNull { it.second }?.first}")
}