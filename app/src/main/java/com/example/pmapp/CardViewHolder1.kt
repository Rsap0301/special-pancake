package com.example.pmapp

import androidx.recyclerview.widget.RecyclerView
import com.example.pmapp.databinding.CardHrzntlBinding

class CardViewHolder1 (

    private val cardHrzntlBinding: CardHrzntlBinding,
    private val clickListener: BookClickListener
    ) : RecyclerView.ViewHolder(cardHrzntlBinding.root)
    {
        fun bindBook(book: Book, position: Int)
        {
            cardHrzntlBinding.imgbench1.setImageResource(book.cover)
            cardHrzntlBinding.Title.text = book.name
            cardHrzntlBinding.etDesc.text = book.desc

            cardHrzntlBinding.cardView1.setOnClickListener{

                clickListener.onClick(book, position)
            }
        }

    }

