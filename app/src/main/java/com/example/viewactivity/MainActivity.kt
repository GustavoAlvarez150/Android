package com.example.viewactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.viewactivity.adapter.videoAdapter
import com.example.viewactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerViewVideo()

    }

    //Se declara el menu para que nos pueda aparecer en la pantalla principal, y de ahí se parte para darle acciones a los botones que muestra en el menú
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    private fun initRecyclerViewVideo(){
        val manager = LinearLayoutManager(this)
        val decoration = DividerItemDecoration(this, manager.orientation)

        binding.recycleViewSuperHeroe.layoutManager = LinearLayoutManager(this)
        binding.recycleViewSuperHeroe.adapter = videoAdapter(SuperHeroes.listVideo,{Video ->onItemSelectedVideo(Video)})
        binding.recycleViewSuperHeroe.addItemDecoration(decoration)
    }

    fun onItemSelectedVideo(nameVideo: Video){
        //Se deberá abrir el segundo layout y enviar el nombre del video para que posteriormente se pueda reproducir
        val inte = Intent(this, PlayVideo::class.java).apply {

            putExtra("path", nameVideo.pathvideo)
        }

        startActivity(inte)

    }

}