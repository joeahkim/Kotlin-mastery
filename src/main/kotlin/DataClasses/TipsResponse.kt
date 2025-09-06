package DataClasses

data class TipsResponse(val status : String, val message : String, val data : List<Match>)

data class Match(val id : Int, val homeTeam : String, val awayTeam : String,
                 val league : String, val time: String, val prediction : String)
fun main() {
    val match1 = Match(2, "Greece", "Ireland", "UEFA Nations League", "21:45", "Home Over 0.5")
    val match2 = Match(3, "Greece", "Ireland", "UEFA League", "20:30", "Home Win")

    val response = TipsResponse( "Success", "Today's tips loaded successfully", listOf(match1, match2))

        println("All Matches:")
    for (i in response.data){
        println(" ${i.homeTeam} vs ${i.awayTeam} ${(i.league)} - ${i.time} -> Prediction: ${i.prediction}")
    }

    println("\nFiltered Matches (UEFA Nations League):")
    fun filterByLeague(matches: List<Match>, league: String): List<Match> {
        return matches.filter { it.league == league }
    }
    val filteredMatches = filterByLeague(response.data, "UEFA Nations League")
    for (i in filteredMatches){
        println(i)
    }
}
