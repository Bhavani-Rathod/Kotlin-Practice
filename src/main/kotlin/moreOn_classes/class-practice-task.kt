package moreOn_classes

fun main(){

    val userAccount = Account("Bhavani")
    println("Username:   ${userAccount.accountName}")
    userAccount.deposit(500)
    userAccount.withdraw(100)
    userAccount.withdraw(100)
    userAccount.deposit(200)
}

class Account(var accountName:String){
    private var balance = 0


    fun deposit(amount:Int){
        if (amount>0){

            balance+=amount
            println("$amount is deposited. Total balance is now $balance")
        }
        else{
            println("Cannot deposit negative sums")
        }
    }

    fun withdraw(amount: Int){
        if (amount<balance){

            balance-=amount
            println("$amount is withdrawn. Total balance is now $balance")
        }
        else{
            println("There is no enough amount in the account")
        }
    }
}