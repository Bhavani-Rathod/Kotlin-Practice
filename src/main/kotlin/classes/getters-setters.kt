package classes

fun main(){

    val city = City("Glb","Kar",10)

    println(city.name)
    city.name = "Blore"

}

class City(name:String, var state:String, var distance:Int){

    var name = name
        get() {
            return "name: $field"
        }

        set(value) {
            field = value
            println("The city name is $value")
        }
}