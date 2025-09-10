package EnumClasses

enum class TransactionType {
    Deposit, Withdraw, Transfer
}

class Transaction(var balance : Double){
    fun performTransaction(type: TransactionType, amount: Double) {
        when (type) {
            TransactionType.Deposit -> {
                balance += amount
                println("Amount deposited is $amount. Balance is $balance")
            }
            TransactionType.Withdraw -> {
                if (balance >= amount){
                    balance -= amount
                    println("Amount Withdrawn is $amount. Balance is $balance")
                } else{
                    println("Not enough money")
                }
            }
            TransactionType.Transfer -> {
                println("Transferred $amount to another account")
            }
        }
    }
}

fun main(){
    val transaction = Transaction(50.5)
    transaction.performTransaction(TransactionType.Deposit, 50.5)
    transaction.performTransaction(TransactionType.Withdraw, 30.3)
    transaction.performTransaction(TransactionType.Transfer, 70.5)
}