package classes

class Animal(name:String, var color:String, var legs:Int) {

    var name = name.trim()

    fun walk(){
        println("Animal $name is walking")
    }

}

fun main(){

    val animal = Animal("  Tiger","Orange",4)

    println("Animal ${animal.name} having color ${animal.color} with ${animal.legs} legs is seen in the forest. ")

    animal.walk()

}