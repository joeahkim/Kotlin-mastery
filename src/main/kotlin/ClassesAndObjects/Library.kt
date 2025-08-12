package ClassesAndObjects
//Create a Book class with:
//    title (String)
//author (String)
//isBorrowed (Boolean) — defaults to false
//A method borrowBook() that sets isBorrowed to true if not already borrowed
//A method returnBook() that sets it to false
class Library {
}
class Book(val title: String, val author: String, var isBorrowed: Boolean){
    fun borrowBook(){
        if (!isBorrowed){
            isBorrowed = true
            println("$title is borrowed")
        }else{
            println("$title was already borrowed")
        }
    }
    fun returnBook(){
        if (!isBorrowed){
            isBorrowed = false
            println("$title has been returned")
        }else{
            println("$title was not taken")
        }
    }
}