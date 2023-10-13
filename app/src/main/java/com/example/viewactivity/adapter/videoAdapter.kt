package com.example.viewactivity.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.example.viewactivity.R

import com.example.viewactivity.Video


class videoAdapter(private val videoList: List<Video>, private  val onClickListener: (Video) -> Unit): RecyclerView.Adapter<videoViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): videoViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return videoViewHolder(layoutInflater.inflate(R.layout.item_superheroe, parent, false))
    }

    override fun getItemCount(): Int = videoList.size

    override fun onBindViewHolder(holder: videoViewHolder, position: Int) {
       var item =videoList[position]
        holder.render(item, onClickListener)
    }


}