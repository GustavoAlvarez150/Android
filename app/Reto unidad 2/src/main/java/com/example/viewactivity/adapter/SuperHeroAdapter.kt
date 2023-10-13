package com.example.viewactivity.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.viewactivity.Song
import com.example.viewactivity.R



class SuperHeroAdapter( private val superHeroesList: List<Song>, private val onCLickListener:(Song) -> Unit ) : RecyclerView.Adapter<SuperHeroesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroesViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SuperHeroesViewHolder(layoutInflater.inflate(R.layout.item_superheroe, parent, false))
    }

    override fun onBindViewHolder(holder: SuperHeroesViewHolder, position: Int) {
        var item = superHeroesList[position]
        holder.render(item, onCLickListener)
    }


    override fun getItemCount(): Int = superHeroesList.size

}