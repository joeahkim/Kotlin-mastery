package CollectionsII

//fun main() {
//    val visits = listOf(
//        "kim@example.com",
//        "regina@example.com",
//        "kim@example.com",
//        "derrick@example.com",
//        "derrick@example.com",
//        "kim@example.com"
//    )
//    val setVisits = visits.toSet()
//    println(setVisits.size)
//    for (i in setVisits){
//        println(i)
//    }
//}

//fun main() {
//    val userAFriends = listOf("Kim", "Regina", "Derrick", "Faith", "Brian")
//    val userBFriends = listOf("Regina", "Derrick", "Hassan", "Ivy", "Kim")
//
//
//    val commonFriends = userBFriends.intersect(userAFriends)
//    println(commonFriends)
//
//    val uniqueToA = userAFriends.subtract(userBFriends)
//    println(uniqueToA)
//
//    val union = userAFriends.union(userBFriends)
//    println(union.sorted())
//}

fun main(){
    val breachedPasswords = setOf("123456", "password", "qwerty", "admin", "letmein")

    val userPasswords = mapOf(
        "Kim" to "hello123",
        "Regina" to "qwerty",
        "Derrick" to "securePass1",
        "Faith" to "123456",
        "Brian" to "welcome2025"
    )

    for ((i, password) in userPasswords){
        if (password in breachedPasswords){
            println(i)
        }
    }
}