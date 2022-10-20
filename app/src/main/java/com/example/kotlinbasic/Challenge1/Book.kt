package com.example.kotlinbasic.Challenge1


class Book(override val title: String, override val genre: String, override val pubYear: Double,val author:String) : InventoryItem(title, genre, pubYear) {
    override fun borrow() {
        TODO("Not yet implemented")
    }
}