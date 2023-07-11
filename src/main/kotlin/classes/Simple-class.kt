package classes

fun main(){

    val car = Car()
    car.name = "Tesla"
    car.model = "1cc"
    car.color = "Blue"
    car.doors = 4

    car.move()
    car.stop()

    println("")

    var car2 = Car()
    car2.name = "Mercedes"
    car2.model = "31F"
    car2.color = "Black"
    car2.doors = 4

    car2.move()
    car2.stop()

}

class Car{

    var name = ""
    var model = ""
    var color = ""
    var doors = 0

    fun move(){
        println("$name is moving")
    }

    fun stop(){
        println("$name having $color color has stopped")
    }

}