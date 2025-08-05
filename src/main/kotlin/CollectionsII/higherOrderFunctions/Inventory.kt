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
}