package com.example.viewactivity.adapter

import android.view.View

import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.viewactivity.Movie

import com.example.viewactivity.databinding.ItemSuperheroeBinding

class SuperHeroesViewHolder(val viewH: View):RecyclerView.ViewHolder(viewH) {

    val binding = ItemSuperheroeBinding.bind(viewH)




    fun render(superHeroesModels: Movie,  onCLickListener:(Movie) -> Unit){
        binding.NombreReal.text = superHeroesModels.realName
        binding.NombreSuper.text = superHeroesModels.superHeroe
        binding.Publishername.text = superHeroesModels.publisher
        Glide.with(binding.SuperHeoreImage.context).load(superHeroesModels.photo).into(binding.SuperHeoreImage)

        //binding.SuperHeoreImage.setOnClickListener{Toast.makeText(binding.SuperHeoreImage.context, superHeroesModels.realName, Toast.LENGTH_LONG).show()}

        itemView.setOnClickListener{onCLickListener(superHeroesModels)}
    }


}