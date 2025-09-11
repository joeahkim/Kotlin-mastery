package EnumClasses

enum class WeatherCondition(val description: String) {
    SUNNY("Clear sky, perfect for outdoor activities"),
    CLOUDY("Overcast, might rain later"),
    RAINY("Carry an umbrella, it's raining"),
    STORMY("Stay indoors! Dangerous weather"),
    SNOWY("Snowfall expected, dress warmly")
}

class WeatherReporter {
    fun getWeatherAlert(condition: WeatherCondition) {
        when (condition) {
            WeatherCondition.SUNNY -> println("It's sunny today! ${condition.description}")
            WeatherCondition.CLOUDY -> println("It's cloudy today. ${condition.description}")
            WeatherCondition.RAINY -> println("Warning: ${condition.description}")
            WeatherCondition.STORMY -> println("ALERT! ${condition.description}")
            WeatherCondition.SNOWY -> println("❄${condition.description}")
        }
    }
    fun getSafetyAdvice(condition: WeatherCondition){
        when(condition){
            WeatherCondition.RAINY -> println("Carry and umbrella!")
            WeatherCondition.SUNNY -> println("Go Hiking!")
            WeatherCondition.STORMY -> println("Stay Indoors!")
            WeatherCondition.SNOWY -> println("Dress Warmly")
            WeatherCondition.CLOUDY -> print("Normal Day")
        }
    }
}
fun main() {
    val reporter = WeatherReporter()

    reporter.getWeatherAlert(WeatherCondition.SUNNY)
    reporter.getWeatherAlert(WeatherCondition.RAINY)
    reporter.getWeatherAlert(WeatherCondition.STORMY)
    reporter.getSafetyAdvice(WeatherCondition.SUNNY)
    reporter.getSafetyAdvice(WeatherCondition.CLOUDY)
}

