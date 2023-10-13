package com.example.viewactivity.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView

import com.example.viewactivity.Video
import com.example.viewactivity.databinding.ItemSuperheroeBinding

class videoViewHolder(val  viewH: View) : RecyclerView.ViewHolder(viewH){
    private val binding = ItemSuperheroeBinding.bind(viewH)


    fun render(videoModel: Video, onCLickListener:(Video) -> Unit){
        binding.NombreReal.text = videoModel.artisName
        binding.NombreSuper.text = videoModel.nameVideo

        //Glide.with(binding.bandImage.context).load(songModel.photo).into(binding.bandImage)



        itemView.setOnClickListener{onCLickListener(videoModel)}
    }
}