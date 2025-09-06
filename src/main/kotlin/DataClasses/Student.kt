package DataClasses

data class Student(val id : Int, val name : String, val grade : Double)

fun main(){
    val student1 = Student(1, "Kim", 95.0)
    val student2 = Student(2, "Papi", 65.0)
    val student3 = Student(1,"Ireri", 90.5)
    val students : List<Student> = listOf(
        student1, student2, student3
    )
    for (i in students){
        println(i)
    }
    val copied = student1.copy(grade = 93.0)
    println("Copied student -> ${copied}")
    println("name : ${copied.name} grade : ${copied.grade}")
}