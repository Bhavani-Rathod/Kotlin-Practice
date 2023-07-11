package arrays

fun main(){

    maxNum(arrayOf(8,2,4,10,3,41,30,1))
    minNum(arrayOf(3,8,0,5,-1,5,6))
}

fun maxNum(numbers:Array<Int>){

    var max = numbers[0]

    for (i in numbers){
        if (i>max){
            max = i
        }
    }
    println("Biggest number is: $max")
}

fun minNum(numbers: Array<Int>){

    var min = numbers[0]

    for (i in numbers){
        if (i<min){
            min = i
        }
    }
    println("Smallest number is: $min")

}

