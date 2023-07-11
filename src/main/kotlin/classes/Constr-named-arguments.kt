package classes

class Family(var father:String,var mother:String="",var members:Int=0){

}

fun main(){

    val family = Family("Subhash")
    println("${family.father}, ${family.mother}, Total members: ${family.members}")

    val family2 = Family("John","Ruby")
    println("${family2.members}")

    val family3 = Family(members = 5, father = "John")
    println("${family3.mother},${family3.father}")

}