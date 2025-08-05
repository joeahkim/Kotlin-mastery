package CollectionsII.higherOrderFunctions

//Print true if any student scored below 50
//Print true if all students passed (score ≥ 50)
//Print true if none scored 100
//fun main(){
//    val students = listOf(70, 85, 90, 40, 60)
//    println(students.any { it < 50 })
//    println(students.all { it > 50 })
//    println(students.none{it == 100})
//}

//Check if anyone is under 18
//Check if all users are above 16
//Check if no one is older than 60
//fun main(){
//    val users = listOf(
//        "Kim" to 25,
//        "Regina" to 19,
//        "Derrick" to 31,
//        "Faith" to 17
//    )
//    println(users.any { it.second < 18 })
//    println(users.all { it.second > 18 })
//    println(users.any { it.second > 60 })
//}

//Check if anyone is from Kisumu
//Check if all users are from Nairobi
//Check if none are from Eldoret
fun main(){
    val users = listOf(
        "Kim" to "Nairobi",
        "Regina" to "Kisumu",
        "Derrick" to "Nairobi",
        "Faith" to "Mombasa",
        "Brian" to "Nairobi"
    )

    println(users.any { it.second == "Kisumu" })
    println(users.all { it.second == "Nairobi" })
    println(users.none { it.second == "Eldoret" })
}