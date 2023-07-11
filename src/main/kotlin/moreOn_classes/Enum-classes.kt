package moreOn_classes

fun main(){
    println(Direction.EAST.distance)

    for (direction in Direction.values()){
        println(direction)

        println(Direction.EAST.printData(10))
    }

    println("-------")

    val direction = Direction.valueOf("NORTH")

    when(direction){
        Direction.EAST-> println("Its East")
        Direction.NORTH-> println("Its North")
        Direction.WEST-> println("Its West")
        Direction.SOUTH-> println("Its South")

    }
}

enum class Direction(var distance:Int, private var direction:String){
    EAST(10,"east"),
    WEST(11,"west"),
    NORTH(12,"north"),
    SOUTH(13,"south");

    fun printData(distance:Int):String{
        return if (distance==EAST.distance){
            Direction.EAST.direction
        } else{
            "other"
        }
    }

}