package com.example.kotlinbasic

import android.os.Build

interface Driveable {
    fun drive()
}

interface Buildable {

    val timeRequired:Int
    fun build()
}



class Interfaces(val color:String):Driveable,Buildable {
    override val timeRequired = 100
    override fun drive() {
        println("Driving Car...")
    }

    override fun build() {
        println("Built a Shiny Car...")
    }


}

fun main(args:Array<String>) {

    val car: Driveable = Interfaces("Blue")

    car.drive()

    val motor:Buildable = Interfaces("Red")

    motor.build()
}
