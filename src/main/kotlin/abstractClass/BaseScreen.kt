package abstractClass

abstract class BaseScreen {
    abstract fun renderUI() : String
    fun navigateTo(screenName : String){
        println("Navigating to $screenName")
    }
}
class HomeScreen: BaseScreen(){
    override fun renderUI() : String {
        println("Rendering Home Screen")
        return "Rendering Home Screen"
    }
}
class ProfileScreen: BaseScreen(){
    override fun renderUI() : String {
        println("Rendering Profile Screen")
        return "Rendering Profile Screen"
    }
}
class SettingsScreen: BaseScreen(){
    override fun renderUI() : String {
        println("Rendering Settings Screen")
        return "Rendering Settings Screen"
    }
}

fun main(){
    val profileScreen = ProfileScreen()
    val homeScreen = HomeScreen()
    val settingsScreen = SettingsScreen()

    profileScreen.navigateTo("profile Screen")
    profileScreen.renderUI()
    homeScreen.navigateTo("home Screen")
    homeScreen.renderUI()
    settingsScreen.navigateTo("settings Screen")
    settingsScreen.renderUI()
}