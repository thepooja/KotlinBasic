package com.example.kotlinbasic

open class Person(open val name:String,open var age:Int)
{

    init {
        println("Object Created.!")
    }


    fun speak()
    {
        println("Super Class - Speak Method Called")
    }

    fun greet(name: String)
    {
        println("Welcome $name to World ")
    }

}


class Student(override val name:String,override var age:Int):Person(name, age)
{

    fun display()
    {
        println("Display Students")
    }

}

class Employee(val name:String,var age:Int)
{

    fun welcome()
    {
        println("Welcome")
    }

}

fun main() {

    val person = Person("Pooja",27)


    val student = Student("Mantri",30)
    student.speak()
    student.display()


    val employee = Employee("Welcome",34)

    employee.welcome()
}