package SealedClasses

sealed class TrafficLight {
    object Red : TrafficLight()
    object Yellow : TrafficLight()
    object Green : TrafficLight()
}
fun reactToLight(light: TrafficLight){
    when(light){
        is TrafficLight.Red -> println("Red")
        is TrafficLight.Yellow -> println("Yellow")
        else -> println("Green")
    }
}

fun main(){
    reactToLight(TrafficLight.Red)
    reactToLight(TrafficLight.Yellow)
    reactToLight(TrafficLight.Green)
}