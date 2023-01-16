package com.example.kotlinbasic.concepts

class HighOrderFunctions {
    fun addTwoNumbers(a:Int,b:Int,action:(Int,Int) ->Int) // High Level Function with lambda Function
    {
        val result = action(a,b)  // x+y= a+b = 10+20 = 30
        println(result)
    }
}
fun main() {
    val program = HighOrderFunctions()

    // Lambda Expression/Function - 1st Way
    val mySum: (Int,Int) ->Int = {x:Int,y:Int -> x+y}
    program.addTwoNumbers(10,20,mySum)

    // Second Way to Call lambda Expression in Function , Directly add Lambda Expression
    program.addTwoNumbers(10,20,{x,y -> x+y})
}