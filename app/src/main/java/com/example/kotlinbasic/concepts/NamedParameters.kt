package com.example.kotlinbasic.concepts
class House(val height:Double,val colour:String,val price:Int = 10000)
{

    fun print(){

        println("House [height =$height, Colour =$colour, Price=$price]")
    }
}


fun main() {

    // Simele
    val house = House(3.4,"Blue",342000)

    // Named Params -
    // In Name Params we can change order as well and add names for params for readbility

    val redHouse = House(colour = "Red",price = 102222,height = 5.5)

    house.print()
    redHouse.print()

    // Default Value -- Add value in Constructor for default

    val def = House(colour = "Pink",height = 6.0)

    def.print()

}