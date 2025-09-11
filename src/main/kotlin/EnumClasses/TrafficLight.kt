package EnumClasses

enum class TrafficLight(val description: String) {
    RED("Stop immediately!"),
    YELLOW("Slow down, prepare to stop."),
    GREEN("Go now!")
}

class TrafficController {

    fun getAction(light: TrafficLight): String {
        return when (light) {
            TrafficLight.RED -> "Action: Stop immediately!"
            TrafficLight.GREEN -> "Action: Go now!"
            TrafficLight.YELLOW -> "Action: Slow down, prepare to stop."
        }
    }

    fun nextLight(current: TrafficLight): TrafficLight {
        return when (current) {
            TrafficLight.RED -> TrafficLight.GREEN
            TrafficLight.GREEN -> TrafficLight.YELLOW
            TrafficLight.YELLOW -> TrafficLight.RED
        }
    }
}

fun main() {
    val controller = TrafficController()
    var currentLight = TrafficLight.RED

    repeat(5) {
        println("Current Light: $currentLight | ${controller.getAction(currentLight)}")
        currentLight = controller.nextLight(currentLight)
    }
}
