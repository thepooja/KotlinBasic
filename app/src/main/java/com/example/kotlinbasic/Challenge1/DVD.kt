package com.example.kotlinbasic.Challenge1

class DVD(override val title: String, override val genre: String, override val pubYear: Double,val length:Double):InventoryItem(title, genre, pubYear) {

    override fun borrow() {
        TODO("Not yet implemented")
    }
}