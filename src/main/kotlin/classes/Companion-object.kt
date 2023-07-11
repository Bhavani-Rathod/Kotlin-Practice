package classes

fun main(){

    val result = College.sum(2,3)
    println(result)

    println(College.max)
    println(Int.MIN_VALUE)
}

class College(){

    companion object{

        var max = 10

        fun sum(a:Int,b:Int):Int{
            return a+b
        }

    }

}