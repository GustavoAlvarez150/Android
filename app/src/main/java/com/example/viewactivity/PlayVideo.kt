package com.example.viewactivity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView
import androidx.lifecycle.lifecycleScope
import com.example.viewactivity.databinding.ActivityPlayVideoBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.cancel
import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import kotlin.random.Random
import kotlin.time.toDuration

class PlayVideo : AppCompatActivity() {

    var videoView: VideoView? = null

    companion object {
        var setTime : Int = 1
    }
    override fun onPause() {
        super.onPause()

        var positionVideoMus = videoView!!.currentPosition

        var aux = PlayVideo.setTime
    }

    override fun onResume() {
        super.onResume()
        var aux = 1
        videoView!!.seekTo(PlayVideo.setTime)

        videoView!!.setOnPreparedListener {


        }
        videoView!!.start()
    }

    private lateinit var binding: ActivityPlayVideoBinding
    var mediaController: MediaController? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlayVideoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var bundle = intent.extras
        //Obtenemos los videos
        var pathViodeoAdds = SuperHeroes.listVideoAdds.random().pathvideo
        val videoPath = bundle!!.get("path")

        videoView = binding.videoView as VideoView?

        if (mediaController == null) {

            mediaController = MediaController(this)
            mediaController!!.setAnchorView(this.videoView)
        }

        var getTimeRandom = 0
        var getTimeEnd = 0
        var myContex = this
      lifecycleScope.launch(Dispatchers.Main) {

          playVideo(videoPath)
          //se obtiene la duracion del video
          videoView!!.setOnPreparedListener { mp ->

              val duration = videoView!!.duration
              getTimeRandom = generateTimeRandom(duration)

              //Ya obtenemos la duracion del video, generamos un tiempo aleatorio, y ya se puede iniciar el video en el tiempo aleatorio
              //FLUJO: se reproduce el video musical, se pausa el video musical en el tiempo generado, y se reproduce el anuncio, y se vuelve a reproducir el video musical en el tiempo aleatorio generado

              lifecycleScope.launch(Dispatchers.Main){
                  getTimeEnd = counPlayAdds(getTimeRandom)
                    //Enviamos el path del anuncio al nuevo activity
                  if (getTimeEnd == 0) {
                      PlayVideo.setTime = getTimeRandom

                      val inte = Intent(myContex, adds::class.java).apply {

                          putExtra("pathAdds", pathViodeoAdds)
                      }

                      startActivity(inte)
                  }
              }
          }
        }
    }

    //contamos los segundos en los cuales aparecerá el anuncio, para después
    suspend fun counPlayAdds(timeRandomadds: Int): Int {
        var auxTime = timeRandomadds
        var seg = auxTime / 1000
        while (seg > 0) {
            seg--
            delay(1000)
        }
        return seg
    }

    //gener aun numero aleatorio para definir en que momento se reproducira el anuncio
    fun generateTimeRandom(endTimeRandom: Int): Int {
        var rando = Random(System.nanoTime())
        var getTimeRandom = (0..endTimeRandom).random(rando)
        return getTimeRandom
    }

    //Reproduce un video
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

