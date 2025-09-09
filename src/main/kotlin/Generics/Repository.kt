package Generics

data class User(val id: Int, val name: String, val age: Int)

data class Product(val id: Int, val name: String, val price: Double)

class Repository<T : Any> { // T must be a non-nullable type
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> = items

    fun findBy(filter: (T) -> Boolean): List<T> {
        return items.filter(filter)
    }
}

fun main() {
    val userRepo = Repository<User>()
    userRepo.add(User(1, "Alice", 25))
    userRepo.add(User(2, "Bob", 30))
    userRepo.add(User(3, "Charlie", 20))

    println("All users: ${userRepo.getAll()}")

    val adults = userRepo.findBy { it.age >= 21 }
    println("Adults: $adults")

    val productRepo = Repository<Product>()
    productRepo.add(Product(1, "Laptop", 999.99))
    productRepo.add(Product(2, "Phone", 499.99))

    println("All products: ${productRepo.getAll()}")

    val expensiveProducts = productRepo.findBy { it.price > 500 }
    println("Expensive products: $expensiveProducts")
}
