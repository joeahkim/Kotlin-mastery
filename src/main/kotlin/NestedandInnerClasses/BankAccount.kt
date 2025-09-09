package NestedandInnerClasses

class BankAccount (var balance: Int = 0){
    inner class Transaction(){
        fun makeDeposit(amount: Int){
            balance += amount
            println("Deposited $amount. Current balance is $balance")
        }
        fun makeWithdrawal(amount: Int){
            if (amount <= balance){
                balance -= amount
                println("Withdrawn $amount. Current balance is $balance")
            }else{
                println("Insufficient funds")
            }
        }
    }
    class BankInfo{
        fun printBankName(bankName : String){
            println("Bank Name: $bankName")
        }
    }
}
fun main(){
    val transaction = BankAccount(0).Transaction()
    transaction.makeDeposit(30)
    transaction.makeWithdrawal(40)
    BankAccount.BankInfo().printBankName("Fintech Bank")
}