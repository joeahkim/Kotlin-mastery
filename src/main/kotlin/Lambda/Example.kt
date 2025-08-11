package Lambda

// use a lambda with collection functions to find the maximum product of any two distinct numbers.
fun main(){
    val nums = listOf(3, 5, -2, 9, -8)
    val sortedNums = nums.sorted()
    val product1 = sortedNums.takeLast(2).reduce { a, b -> a * b }
    val product2 = sortedNums.take(2).reduce { a, b -> a * b }

    val maxProduct = maxOf(product1, product2)
    println(maxProduct)
}