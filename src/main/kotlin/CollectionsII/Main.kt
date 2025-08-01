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

//fun main(){
//    val breachedPasswords = setOf("123456", "password", "qwerty", "admin", "letmein")
//
//    val userPasswords = mapOf(
//        "Kim" to "hello123",
//        "Regina" to "qwerty",
//        "Derrick" to "securePass1",
//        "Faith" to "123456",
//        "Brian" to "welcome2025"
//    )
//
//    for ((i, password) in userPasswords){
//        if (password in breachedPasswords){
//            println(i)
//        }
//    }
//}

fun main(){
    val rsvpList = setOf("Kim", "Regina", "Derrick", "Faith", "Brian", "Ivy")
    val actualAttendees = setOf("Kim", "Regina", "Brian", "Zara", "Elvis")

    val attended = rsvpList.intersect(actualAttendees)
    println("Who attended: ${attended.joinToString()}")

    val rsvpButNeverShowedUp = rsvpList.subtract(actualAttendees)
    println("RSVP but never showed up: ${rsvpButNeverShowedUp.joinToString()}")

    val attendedWithoutRsvp = actualAttendees.subtract(rsvpList)
    println("Attended without RSVP: ${attendedWithoutRsvp.joinToString()}")

}