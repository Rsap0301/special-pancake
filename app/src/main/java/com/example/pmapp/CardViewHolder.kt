package com.example.pmapp

import androidx.recyclerview.widget.RecyclerView
import com.example.pmapp.databinding.CardCellBinding

class CardViewHolder(
    private val cardCellBinding: CardCellBinding,
    private val clickListener: BookClickListener
) : RecyclerView.ViewHolder(cardCellBinding.root)
{
    fun bindBook(book: Book)
    {
        cardCellBinding.imgbench.setImageResource(book.cover)
        cardCellBinding.Title.text = book.name
        cardCellBinding.etDesc.text = book.desc

        cardCellBinding.cardView.setOnClickListener{
            clickListener.onClick(book)
        }
    }
}