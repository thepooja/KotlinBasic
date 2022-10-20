package com.example.kotlinbasic

import java.util.*

// Basic Function
fun helloWorld()
{
    println("Hello World.!")
}

// With Params
fun paramsFunc(text:String)
{
    println(text)
}

// With Params

fun  returnFunc(a:Int,b:Int)
{
   println(a+b)
}


// Retun Type
fun getCurrentDate(): Date
{
    return Date()
}

// Params & Return

fun getMax(a:Int,b:Int):Int{

    if (a >= b)
    {
        return a
    }
    else{
        return b
    }
}

// Main Function
fun main() {

    helloWorld()

    paramsFunc("Pooja Mantri")

    returnFunc(10,20)

    println(getCurrentDate())

    println(getMax(30,20))
}