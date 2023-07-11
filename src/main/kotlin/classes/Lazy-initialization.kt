package classes

fun main(){
    val man = Man("Alex",25,4)
    val man2 = Man("Robin",23,30)

    val man3 by lazy {
        Man("Smith",24,35)
    }
    println(man3.name)

}

class Man(var name:String, var age:Int, var rollNo:Int){

    init {
        println("Man having name $name is of age $age")
    }

}