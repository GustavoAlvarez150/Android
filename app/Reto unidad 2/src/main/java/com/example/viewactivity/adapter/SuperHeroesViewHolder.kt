package com.example.viewactivity.adapter

import android.view.View


import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.viewactivity.Song

import com.example.viewactivity.databinding.ItemSuperheroeBinding

class SuperHeroesViewHolder(val viewH: View):RecyclerView.ViewHolder(viewH) {

    private val binding = ItemSuperheroeBinding.bind(viewH)


    fun render(songModel: Song,  onCLickListener:(Song) -> Unit){
        binding.NombreReal.text = songModel.nameArtis
        binding.NombreSuper.text = songModel.nameSong

        Glide.with(binding.bandImage.context).load(songModel.photo).into(binding.bandImage)



        itemView.setOnClickListener{onCLickListener(songModel)}
    }


}