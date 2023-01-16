package com.example.kotlinbasic.concepts

class ScopeFunctions {

    var name:String ="ScopeFunctions"
    var age:Int = 20

}

fun main() {
    val sfWith = ScopeFunctions()
    // With -->
    // 'this' keyword and return 'lambda result'
    val ageAfterFiveYears:Int =  with(sfWith){
      println(this.name)
      println(this.age)
      age+5 // return lambda result
    }
    println("Lambda Result after $ageAfterFiveYears")

    // apply -->
    // 'this' keyword and return 'context object'
    val sfApply = ScopeFunctions().apply {
        name = "Pooja Mantri"
        age = 29
    }

    // also -->
    // 'it' keyword and return 'context object'
    val sfAlso = sfWith.also {
        it.name = "Also Scope Functions"
        it.age = 30
    }

    // let -->
    // 'it' reference and return 'lambda result'
    // Use 'let'to avoid nullpointerexception

    val duplicateName:String? = null

    val stringLength = duplicateName?.let {  // it will check string is null or not , and if it is not null then following code will run
        println(it.reversed())
        println(it.capitalize())
        it.length // lambda return
    }
    println(stringLength)

    // run -->
    // 'this' reference and return 'lambda result'
    // If you want to operate on a Nullable Object and avoid NPE then use 'run'

    val sfObj:ScopeFunctions? = null
    val bio = sfObj?.run {
        println(this.name)
        "Return Lambda Result"

    }

}



/// Notes --->

/*
* With --> If you want to operate on non-Null Object
* let --> If you want to just execute lambda expression on nullable object and avoid nullpointer exception
* run --> If you want to operate on nullable object , execute lambda expression and avoid NPE
* apply --> If you want to intialise or configure object
* also --> If you want to do some additonal object opetion or configuration
* */