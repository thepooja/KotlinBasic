package com.example.kotlinbasic

abstract class AbstractClass(open val name:String,open var age:Int)
{

    init {
        println("Object Created.!")
    }


    abstract fun speak()


    fun greet(name: String)
    {
        println("Welcome $name to World ")
    }

}


class ABStudent(override val name:String,override var age:Int):AbstractClass(name, age)
{

    fun display()
    {
        println("Display Students")
    }

    override fun speak()
    {

        println("Hi There, I am Student.!")
    }

}

class ABEmployee(override val name:String,override var age:Int):AbstractClass(name, age)
{

    fun welcome()
    {
        println("Welcome")
    }

    override fun speak() {
        println("Hi There, I am Employee!")
    }

}

fun main() {

       val student = ABStudent("Mantri",30)
    student.speak()
    student.display()


    val employee = ABEmployee("Welcome",34)

    employee.speak()
    employee.welcome()
}