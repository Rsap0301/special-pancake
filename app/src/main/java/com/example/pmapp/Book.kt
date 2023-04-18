package com.example.pmapp

var bookList = mutableListOf<Book>()

val BOOK_ID_EXTRA = "bookExtra"

class Book(
    var cover: Int,
    var name: String,
    var desc: String,
    val id: Int? = bookList.size
)