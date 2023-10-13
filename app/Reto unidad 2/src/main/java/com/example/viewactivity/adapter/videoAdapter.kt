package com.example.viewactivity.adapter

import android.content.DialogInterface.OnClickListener
import android.service.autofill.OnClickAction
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.viewactivity.R
import com.example.viewactivity.Song
import com.example.viewactivity.Video
import com.example.viewactivity.databinding.ItemSuperheroeBinding

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