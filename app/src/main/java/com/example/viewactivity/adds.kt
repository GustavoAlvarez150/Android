package com.example.viewactivity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView
import androidx.lifecycle.lifecycleScope
import com.example.viewactivity.databinding.ActivityAddsBinding
import com.example.viewactivity.databinding.ActivityPlayVideoBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class adds : AppCompatActivity() {


    var videoView: VideoView? = null

    private lateinit var binding: ActivityAddsBinding
    var mediaController: MediaController? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adds)

        binding = ActivityAddsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var bundle = intent.extras

        val videoPathAdds = bundle!!.get("pathAdds")


        videoView = binding.videoView as VideoView?

        if (mediaController == null) {

            mediaController = MediaController(this)
            mediaController!!.setAnchorView(this.videoView)
        }

        //Reproducimos el anuncio
        lifecycleScope.launch(Dispatchers.Main){
            playVideo(videoPathAdds)
            countBtn()

            videoView!!.setOnCompletionListener {
                finish()
            }

        }

        binding.skipBtn.setOnClickListener {
            finish()
        }

    }
    suspend fun countBtn() {
        var count: Int = 5

        while (count >= 0) {
            binding.skipBtn.text = "Saltar anuncio en " + count--
            delay(1000)
            //habilitamos el botón cuando el contador haya llegado a cero
            if (count == 0) {
                binding.skipBtn.isEnabled = true
            }

        }
    }

    suspend fun playVideo(pathVideo: Any?) {
        videoView!!.setMediaController(mediaController)

        videoView!!.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + pathVideo))

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


