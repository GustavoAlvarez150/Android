package com.example.viewactivity

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView
import com.example.viewactivity.databinding.ActivityPlaySoundBinding
import com.example.viewactivity.databinding.ActivityPlayVideoBinding

class PlayVideo : AppCompatActivity() {

    var videoView : VideoView? = null
    private lateinit var binding : ActivityPlayVideoBinding
    var mediaController : MediaController? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlayVideoBinding.inflate(layoutInflater)
        setContentView(binding.root)



        var bundle  = intent.extras
        val videoPath = bundle!!.get("path")


        videoView =  binding.videoView as VideoView?

        if (mediaController == null){

            mediaController = MediaController(this)
            mediaController!!.setAnchorView(this.videoView)
        }


        videoView!!.setMediaController(mediaController)

        videoView!!.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + videoPath))

        videoView!!.requestFocus()

        videoView!!.start()

        videoView!!.setOnCompletionListener {
            Toast.makeText(applicationContext, "Video end", Toast.LENGTH_SHORT).show()
        }

        videoView!!.setOnErrorListener { mediaPlayer, i, i2 ->
            Toast.makeText(applicationContext, "Error Ocurred", Toast.LENGTH_LONG).show()
            false

        }

    }
}