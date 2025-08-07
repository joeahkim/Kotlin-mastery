package CollectionsII.ZippingAndUnzipping

fun main(){
    val names = listOf("Kim", "Regina", "Derrick")
    val scores = listOf(90, 85, 95)
    val x = names.zip(scores){ names, scores ->
        "$names -> $scores"
    }
    println(x)
}