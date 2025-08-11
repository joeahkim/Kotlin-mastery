package Lambda

fun main(){
    val names = listOf("Kim", "Regina", "Michael", "Ali")
    val shorterNames = names.filter { a -> a.length > 3}
    println(shorterNames)
}