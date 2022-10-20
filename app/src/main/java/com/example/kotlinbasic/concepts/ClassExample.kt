package com.example.kotlinbasic.concepts

class ClassExample {

    var name:String ="Pooja"
    var age:Int = 28

    fun speak()
    {
        println("Hello")
    }

    // Fun with params and return

    fun birthday(name:String):Int{

        println(name)
        return 2021- age
    }
}


fun main() {

    val c = ClassExample()

    println(c.birthday(" Age of ${c.name} "))


}