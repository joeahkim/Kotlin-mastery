//data class Student(val name: String, val score: Int)
//
//fun main() {
//    val students = listOf(
//        Student("Alice", 100),
//        Student("Bob", 95),
//        Student("Charlie", 85)
//    )
//
//    val topStudent = students.minByOrNull { it.score }
//    if (topStudent != null){
//        println("Top scorer ${topStudent.name} with ${topStudent.score} points.")
//
//    }else{
//        println("No students found.")
//    }
//
//}


//fun main() {
//    val rawCities = listOf("nairobi", null, " ", "Mombasa", "kisumu", null)
//
//    val capitalCities = rawCities
//        .filterNotNull()                          // remove nulls
//        .map { it.trim() }                        // trim spaces
//        .filter { it.isNotEmpty() }               // remove empty/blank strings
//        .map { it.replaceFirstChar { c -> c.uppercaseChar() } }  // capitalize
//
//    if (capitalCities.isNotEmpty()) {
//        println(capitalCities)
//    } else {
//        println("No cities")
//    }
//}










//fun main() {
//    val rawCities = listOf("nairobi", null, " ", "Mombasa", "kisumu", null)
//
//    val city = rawCities.filterNotNull()
//        .map { it.trim() }
//        .filter { it.isNotEmpty() }
//        .map { it.replaceFirstChar { b -> b.uppercaseChar() } }
//
//    if (city.isNotEmpty()){
//        println("$city")
//    }else{
//        println("No cities")
//    }
//}

//data class Event(val name: String, val day: String)
//
//fun main() {
//    val events = listOf(
//        Event("Meeting", "Monday"),
//        Event("Workout", "Monday"),
//        Event("Shopping", "Tuesday"),
//        Event("Dentist", "Wednesday")
//    )
//
//    val groupedEvents = events.groupBy { it.day }
//    for ((day, eventsOnDay) in groupedEvents) {
//        println("$day:")
//        eventsOnDay.forEach { println(" - ${it.name}") }
//    }
//
//}

//fun main() {
//    val text = "Kotlin is great and kotlin is fun and Kotlin is concise"
//    val wordCount = text.lowercase()
//        .split(" ")
//        .groupingBy { it }
//        .eachCount()
//    for ((word, count) in wordCount){
//        println("$word: $count")
//    }
//}
//

//data class Student(val name: String, val scores: List<Int>)
//
//fun calculateAverageManually(numbers: List<Int>): Double {
//    if (numbers.isEmpty()) {
//        return 0.0
//    }
//    var sum = 0.0
//    for (number in numbers) {
//        sum += number
//    }
//    return sum / numbers.size
//}
//
//
//fun main() {
//    val students = listOf(
//        Student("Alice", listOf(80, 90, 100)),
//        Student("Bob", listOf(50, 60, 70)),
//        Student("Charlie", listOf(90, 95)),
//        Student("Diana", listOf(40, 50)),
//        Student("Eve", emptyList()) // no scores
//    )
//    val nonNullStudents = students.filter { it.scores.isNotEmpty() }
//
//    for (scores in nonNullStudents){
//        val average = calculateAverageManually( scores.scores)
//        if (average>=75){
//            println("${scores.name}: ${average}")
//        }
//    }
//}

//data class Employee(val name: String, val department: String, val scores: List<Int>)
//
//fun calculateAverageManually(numbers: List<Int>): Double {
//    if (numbers.isEmpty()) return 0.0
//    var sum = 0.0
//    for (number in numbers) {
//        sum += number
//    }
//    return sum / numbers.size
//}
//fun main(){
//    val employees = listOf(
//        Employee("Alice", "Sales", listOf(80, 90, 85)),
//        Employee("Bob", "Sales", listOf(70, 75, 72)),
//        Employee("Charlie", "Engineering", listOf(95, 90, 100)),
//        Employee("Diana", "Engineering", listOf(88, 92)),
//        Employee("Eve", "HR", listOf(60, 65)),
//        Employee("Frank", "HR", listOf(80, 82, 84))
//    )
//
//    val departmentEmply = employees.groupBy { it.department }
//    for ((department, evsOnDep) in departmentEmply){
////        println(department)
////        evsOnDep.forEach { println("  - ${it.name} ${(calculateAverageManually(it.scores))}") }
//
//        val topPerformer = evsOnDep.maxByOrNull { calculateAverageManually(it.scores)}
//        if (topPerformer!=null){
//            val avg = calculateAverageManually(topPerformer.scores)
//            println("$department → Top Performer: ${topPerformer.name} (Avg: ${"%.2f".format(avg)})")
//        }
//    }
//
//}

//
//fun main(){
//    println("Enter username")
//    val username: String? = readLine()
//    println("Enter Password")
//    val password: String? = readLine()
//    username?.let {
//        if (it.isNotEmpty()){
//            println("Hello, $it! Your name is ${it.length} characters long")
//        }else{
//            println("Hello, Guest! Welcome to Kotlin.")
//        }
//    }
//    password?.let {
//        if (it.isNotEmpty()){
//            println("Good Password")
//        }
//        else{
//            println("Please enter a password to continue")
//        }
//    }
//}

//fun main(){
//    val numbers: Int = -1
//    when{
//        numbers > 0 -> println("Number is positive")
//        numbers < 0 -> println("number is negative")
//        numbers == 0 -> println("Number is zero")
//    }
//}

//data class Student(val name: String, val subject: String, val score: Int)
//
//fun main() {
//    val students = listOf(
//        Student("Alice", "Math", 78),
//        Student("Bob", "Math", 45),
//        Student("Charlie", "Science", 88),
//        Student("Diana", "Science", 42),
//        Student("Eve", "History", 55),
//        Student("Frank", "History", 30),
//        Student("Grace", "Math", 90),
//        Student("Hank", "Science", 65),
//    )
//    val groupedbySubject = students.groupBy { it.subject }
//    for ((score, marks) in groupedbySubject){
//        marks.forEach {
//            println("${it.name} -> ${it.score}")
//
//        }
//        val failed = marks.filter { it.score < 50 }
//        if (failed.isNotEmpty()){
//            println("failed $score")
//            failed.forEach {
//                println("${it.name} (${it.score})")
//            }
//        }
//    }
//
//}

//data class Product(val name: String, val category: String, val price: Double, val quantity: Int)
//
//fun main(){
//    val products = listOf(
//        Product("Phone", "Electronics", 700.0, 5),
//        Product("Laptop", "Electronics", 1200.0, 3),
//        Product("Apples", "Groceries", 2.0, 50),
//        Product("Milk", "Groceries", 1.5, 30),
//        Product("Headphones", "Electronics", 150.0, 10),
//        Product("Bread", "Groceries", 1.0, 20)
//    )
//    val groupedbyCategory = products.groupBy { it.category }
//    for ((category, categories) in groupedbyCategory){
//        println("Category: $category")
//        categories.forEach {
//            println(" - ${it.name} (${it.price}) x${it.quantity}")
//        }
//        val totalValue = categories.sumOf { it.price * it.quantity }
//        println(totalValue)
//    }
//}

data class Product(val name: String, val category: String, val stock: Int, val threshold: Int)

fun main(){
    val products = listOf(
        Product("Phone", "Electronics", 3, 5),
        Product("Laptop", "Electronics", 1, 2),
        Product("Monitor", "Electronics", 10, 5),
        Product("Milk", "Groceries", 15, 20),
        Product("Bread", "Groceries", 25, 10),
        Product("Apples", "Groceries", 5, 10)
    )
    val lowThreshold = products.filter { it.stock <= it.threshold }
    val groupedByCategory = lowThreshold.groupBy { it.category }
    for ((category, items) in groupedByCategory){
        println("Low Stock in ${category}:")
        items.forEach {
            println(" - ${it.name} (${it.stock} in stock min ${it.threshold})")
        }
    }
}
