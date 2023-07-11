package classes

class Employee(var name:String,var lastname:String,var age:Int){

    constructor(name: String): this(name,"R",23){
        println("Employee age is $age")
    }

}

fun main(){

    val employee = Employee("Bhavani")

    println("Employee ${employee.name} having last name ${employee.lastname} and age ${employee.age}")

}