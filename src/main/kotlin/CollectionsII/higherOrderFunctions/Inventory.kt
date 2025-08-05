package CollectionsII.higherOrderFunctions

data class Product(
    val name: String,
    val category: String,
    val price: Double,
    val stock: Int
)

fun main() {
    val products = listOf(
        Product("Phone", "Electronics", 700.0, 5),
        Product("Laptop", "Electronics", 1200.0, 2),
        Product("Bread", "Groceries", 1.5, 25),
        Product("Milk", "Groceries", 1.2, 10),
        Product("Shoes", "Fashion", 40.0, 0),
        Product("Hat", "Fashion", 15.0, 3),
        Product("Monitor", "Electronics", 0.0, 4)
    )
    val groupedByCategory = products.groupBy { it.category }
    for ((x, y) in groupedByCategory){
        println(x)
        y.groupBy { for (i in y){
        println(" -> ${i.name} ${i.price} : ${i.stock}")
        }
        }
    }

    val lowOnStock = products.filter { it.stock < 5 }
    println(lowOnStock)

// highest and lowest priced product per category
    for ((x, y) in groupedByCategory){
        println(x)
        val max = y.maxByOrNull { it.price }
        val min = y.minByOrNull { it.price }
        println("Highest Price item: ${max?.name}")
        println("Lowest price item: ${min?.name}")
    }
//    Business rules
    println(products.any{it.stock == 0})
    println(products.all { it.stock > 0 })
    println(products.none{ it.name == " " })
}