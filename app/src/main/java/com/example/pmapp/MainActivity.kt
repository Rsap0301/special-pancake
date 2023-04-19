package com.example.pmapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pmapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), BookClickListener {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        populateBooks()

        val mainActivity = this
        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext, 2)
            adapter = CardAdapter(bookList, mainActivity)
        }

        binding.recyclerView1.apply {
            layoutManager =
                LinearLayoutManager(applicationContext, LinearLayoutManager.HORIZONTAL, false)
            adapter = CardAdapter(bookList, mainActivity)
        }
    }

    override fun onClick(position: Int) {

        Toast.makeText(this,position.toString(),Toast.LENGTH_LONG).show()
    }

     private fun populateBooks() {
        val book1 = Book(
            R.drawable.img1,
            "Rigel 1",
            "Rigel Networks 1"
        )
        bookList.add(book1)

        val book2 = Book(
            R.drawable.img2,
            "Rigel 2",
            "Rigel Networks 2"
        )
        bookList.add(book2)

        val book3 = Book(
            R.drawable.img3,
            "Rigel 3",
            "Rigel Networks 3"
        )
        bookList.add(book3)

        val book4 = Book(
            R.drawable.img4,
            "Rigel 4",
            "Rigel Networks 4"
        )
        bookList.add(book4)

        val book5 = Book(
            R.drawable.img5,
            "Rigel 5",
            "Rigel Networks 5"
        )
        bookList.add(book5)

        val book6 = Book(
            R.drawable.img6,
            "Rigel 6",
            "Rigel Networks 6"
        )
        bookList.add(book6)

        val book7 = Book(
            R.drawable.img7,
            "Rigel 7",
            "Rigel Networks 7"
        )
        bookList.add(book7)

        val book8 = Book(
            R.drawable.img8,
            "Rigel 8",
            "Rigel Networks 8"
        )
        bookList.add(book8)

//        val imgbench: ImageView = findViewById(R.id.imgbench)
//        imgbench.setOnClickListener {
//            Toast.makeText(
//                applicationContext,
//                "You Clicked on Rigel 1",
//                Toast.LENGTH_SHORT
//            ).show()
//        }
    }
}