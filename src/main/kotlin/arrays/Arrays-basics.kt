package arrays

fun main(){

    val names = arrayOf("Bhavani", "Subhash", "Rathod")

    names[0] = "Deepak"
    println(names[0])

    for (i in names){
        println(i)
    }

    val mixedElements = arrayOf(1, 2, "Sunny", 'a')

    for (i in mixedElements){
        if (i is Char){
            continue
        }
        println(i)
    }
    println("Array size is : ${mixedElements.size}")

    println(mixedElements.get(3))
}
