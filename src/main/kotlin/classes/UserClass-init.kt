package classes

class User(name:String,var lastname:String, var height:Int){

    var name:String

    init {
        if (name.lowercase().startsWith("s")){
            this.name = name
        }
        else{
            this.name = "User"
            println("The name does not starts with 's'")
        }
    }

}

fun main(){

    val user = User("Bhavani", "Rathod",5)
    println(user.name)

    var user2 = User("Sunny","Rathod",6)

}