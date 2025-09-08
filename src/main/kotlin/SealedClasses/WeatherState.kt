package SealedClasses

import java.util.concurrent.locks.Condition

sealed class WeatherState {
    object Loading : WeatherState()
    data class Success(val temperature: Double, val condition: String) : WeatherState()
    data class Error(val message : String) : WeatherState()
}
//Write a function displayWeatherState(state: WeatherState) that:
//Prints "Loading weather data..." when loading.
//Prints "Weather: <temperature>°C, <condition>" when successful.
//Prints "Error: <message>" when there’s an error.
//In main(), simulate this process by creating three different states and passing them into the function.
fun displayWeatherState(state: WeatherState){
    when(state){
        is WeatherState.Loading -> println("Loading Weather data ...")
        is WeatherState.Success -> println("Weather : ${state.temperature}, ${state.condition}")
        is WeatherState.Error -> println("Error ${state.message}")
    }
}
fun main(){
    displayWeatherState(WeatherState.Loading)
    displayWeatherState(WeatherState.Success(30.0, "Rainy"))
    displayWeatherState(WeatherState.Error("Unknown"))
}