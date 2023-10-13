package com.example.viewactivity

import android.annotation.SuppressLint
import android.content.ClipData
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.viewactivity.adapter.SuperHeroAdapter
import com.example.viewactivity.adapter.videoAdapter
import com.example.viewactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        initRecyclerView()


        //Se le da las propiedades de un toolbar
        setSupportActionBar(binding.toolBar)

    }

    //Se declara el menu para que nos pueda aparecer en la pantalla principal, y de ahí se parte para darle acciones a los botones que muestra en el menú
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.changeMusic -> {
                initRecyclerView()
            }
            R.id.changeVideo -> {

                initRecyclerViewVideo()

            }

        }
        return super.onOptionsItemSelected(item)
    }

    private fun initRecyclerView(){
        val manager = LinearLayoutManager(this)
        val decoration = DividerItemDecoration(this, manager.orientation)
        ///val recyclerView =  findViewById<RecyclerView>(R.id.recycleViewSuperHeroe)
        binding.recycleViewSuperHeroe.layoutManager = LinearLayoutManager(this)
        binding.recycleViewSuperHeroe.adapter = SuperHeroAdapter(SuperHeroes.listSong,{Movie ->onItemSelected(Movie)})
        binding.recycleViewSuperHeroe.addItemDecoration(decoration)
    }

    private fun initRecyclerViewVideo(){
        val manager = LinearLayoutManager(this)
        val decoration = DividerItemDecoration(this, manager.orientation)
        ///val recyclerView =  findViewById<RecyclerView>(R.id.recycleViewSuperHeroe)
        binding.recycleViewSuperHeroe.layoutManager = LinearLayoutManager(this)
        binding.recycleViewSuperHeroe.adapter = videoAdapter(SuperHeroes.listVideo,{Video ->onItemSelectedVideo(Video)})
        binding.recycleViewSuperHeroe.addItemDecoration(decoration)
    }


    fun onItemSelected(nameSong: Song){
    //Se deberá abrir el segundo layout y enviar el nombre de la canción para que posteriormente se pueda reproducir
    val inten = Intent(this, PlaySound::class.java).apply {

      putExtra("path", nameSong.path)
      putExtra("imageSong", nameSong.photo)

    }

        startActivity(inten)

    }


    fun onItemSelectedVideo(nameVideo: Video){
        //Se deberá abrir el segundo layout y enviar el nombre del video para que posteriormente se pueda reproducir
        val inte = Intent(this, PlayVideo::class.java).apply {

            putExtra("path", nameVideo.pathvideo)
            //putExtra("imageSong", nameVideo.)

        }

        startActivity(inte)

    }


}