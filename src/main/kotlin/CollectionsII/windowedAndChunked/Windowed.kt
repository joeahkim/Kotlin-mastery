package CollectionsII.windowedAndChunked

fun main(){
    val temps = listOf(20, 22, 24, 23, 25, 26)
    val slidingTemps = temps.windowed(3, partialWindows = true)
    println(slidingTemps)
}