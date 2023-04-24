package com.example.pmapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pmapp.databinding.CardHrzntlBinding

class Card1Adapter(
    private val books: List<Book>,
    private val clickListener: BookClickListener,
)
    : RecyclerView.Adapter<CardViewHolder1> ()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder1 {
        val from = LayoutInflater.from(parent.context)
        val binding = CardHrzntlBinding.inflate(from, parent, false)
        return CardViewHolder1(binding, clickListener)
    }

    override fun onBindViewHolder(holder: CardViewHolder1, position: Int) {
        holder.bindBook(books[position], position)
    }

    override fun getItemCount(): Int = books.size
}

