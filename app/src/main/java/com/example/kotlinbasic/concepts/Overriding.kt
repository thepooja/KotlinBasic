package com.example.kotlinbasic


abstract class Course(val topic:String,val price:Double)
{
    open fun learn()
    {
        println("Learning a $topic Courses...")
    }
}


interface Learnable{

    fun learn()
    {
        println("Learning....")
    }
}

// Inherit Abstract Class and Interface with same method name
class Kotlincourse:Course("Kotlin",99.0),Learnable {

    // If We want to call same method name with specific class the use Classname using super keyword then that class's method will call
    override fun learn()
    {
        // By Default Interface have final method but if we want to stop override method
        // from child class then we can declare method suing final keyword

        // Learnable Interface method will call
        super<Learnable>.learn()
        println("Child Learn Method ")
    }
}

fun main() {

    val course = Kotlincourse()

    course.learn()
}