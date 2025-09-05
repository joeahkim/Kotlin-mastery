package Interfaces

class MusicPlayer {
}
interface Playable{
    fun play()
}
interface Downloadable{
    fun download()
}
class Song(val name: String) : Playable, Downloadable{
    override fun play() {
        println("Playing Song : $name")
    }

    override fun download() {
        println("Downloading song : $name")
    }
}

class Podcast(val name : String) : Playable{
    override fun play() {
        println("Playing Podcast : $name")
    }
}

fun main(){
    val playlist: List<Playable> = listOf(
        Song("Perfect by Ed Sheeran"),
        Song("Blinding Lights by The Weeknd"),
        Podcast("Tech Talks Episode 1"),
        Podcast("Mindset Matters Episode 5")
    )

    for (item in playlist) {
        item.play()

        if (item is Downloadable) {
            item.download()
        }
    }
}