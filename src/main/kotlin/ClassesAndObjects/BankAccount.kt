package ClassesAndObjects

//Create a BankAccount class that has:
//accountHolder (String)
//balance (Double) — starts at 0
//A deposit(amount: Double) method
//A withdraw(amount: Double) method that prevents overdrafts
class BankAccount(val accountHolder: String, var balance: Double){
    fun deposit(amount: Double){
        if (amount > 0){
            balance += amount
            println("New balance is $balance")
        }else{
            println("Deposit more money")
        }
    }
    fun withdraw(amount: Double){
        when {
            amount <= 0 -> println("Withdrawal amount must be positive")
            amount > balance -> println("Insufficient funds. Current balance: $balance")
            else -> {
                balance -= amount
                println("New balance is $balance")
            }
        }
    }
}
