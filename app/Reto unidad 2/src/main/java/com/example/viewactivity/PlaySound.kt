package com.example.viewactivity

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.viewactivity.databinding.ActivityPlaySoundBinding

class PlaySound : AppCompatActivity() {
    lateinit var mediaPlayer: MediaPlayer
    private lateinit var binding : ActivityPlaySoundBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlaySoundBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var bundle  = intent.extras
        val songImage = bundle!!.get("imageSong")
        val pathSong = bundle!!.get("path")
        //Cargamos la imagen de la canción
        Glide.with(binding.ImageBand.context).load(songImage).into(binding.ImageBand)

        mediaPlayer = MediaPlayer.create(this, pathSong.toString().toInt())


        binding.btnPlay.setOnClickListener{
            mediaPlayer.start()

        }

        binding.btnPause.setOnClickListener{
            mediaPlayer.stop()

        }






    }
}