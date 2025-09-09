package NestedandInnerClasses

class Window(val title: String) {

    inner class Button(val label: String) {
        fun click() {
            println("Button '$label' clicked in window '$title'")
        }
    }

    class Theme(val color: String) {
        fun applyTheme() {
            println("Applying $color theme")
        }
    }
}

fun main() {
    val window = Window("Settings")
    val button = window.Button("Save")
    button.click()

    val theme = Window.Theme("Dark")
    theme.applyTheme()
}
