package com.example.kotlinbasic.concepts

// Constructors Example

// This is Primary Constructor -- Class Brackets
class Construct(name:String,age:Int) {

    // Our Variables Declarations
    var name:String
    var age:Int


    // Initialise Variable with Constructor params
    // You can access values after init function
    // This Initialization Block called once during object creation
    init {
        this.age = age
        this.name = name
    }



    fun display()
    {
        println("Hello To Construct $name , Age is $age")
    }


}

fun main() {

    val c = Construct("Mantri",29)

    c.display()
}