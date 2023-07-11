package classes

fun main(){

    val student = Student("Bhavani",8,23)
    student.lastName = "Rathod"
    println(student.lastName)
}

class Student(var name:String,var std:Int,var age:Int){

    lateinit var lastName:String

}