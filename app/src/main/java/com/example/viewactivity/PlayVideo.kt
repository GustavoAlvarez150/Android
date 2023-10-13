package com.example.viewactivity

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView
import com.example.viewactivity.databinding.ActivityPlayVideoBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.random.Random

class PlayVideo : AppCompatActivity() {

    var videoView : VideoView? = null


    private lateinit var binding : ActivityPlayVideoBinding
    var mediaController : MediaController? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlayVideoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var bundle  = intent.extras
        //Obtenemos los videos
        var pathViodeoAdds = SuperHeroes.listVideoAdds.random().pathvideo
        val videoPath = bundle!!.get("path")

        videoView =  binding.videoView as VideoView?

        if (mediaController == null){

            mediaController = MediaController(this)
            mediaController!!.setAnchorView(this.videoView)
        }

         //var addsAux : any? = null
         GlobalScope.launch(Dispatchers.Main){

            playVideo(videoPath)
             //se obtiene la duracion del video
            var durationVideo = videoView!!.duration
            var timeRando = Random(durationVideo)
            var getTimeRandom = generateTimeRandom(timeRando.nextInt())
             if (counPlayAdds(getTimeRandom) == 0){
                 videoView!!.pause()

                 var adds = GlobalScope.launch(Dispatchers.Main) {
                     playVideo(pathViodeoAdds)
                     videoView!!.setOnCompletionListener {
                         binding.skipBtn.isEnabled = false
                         videoView!!.resume()

                     }

                 }
             }
        }


      /*  adds = GlobalScope.launch(Dispatchers.Main) {
            playVideo(pathViodeoAdds)
            //Una vez que termine el anuncio, reproduce el video
            videoView!!.setOnCompletionListener {
                GlobalScope.launch(Dispatchers.Main) {
                    //Deshabilitamos el botón para saltar el anuncio
                    binding.skipBtn.isEnabled = false
                    playVideo(videoPath)
                }
            }
        }*/

        GlobalScope.launch(Dispatchers.Main) {
            countBtn()
        }


      binding.skipBtn.setOnClickListener{
          //cancelamos la corutina
          adds.cancel()
          //reproducimos le nuevo video
          GlobalScope.launch(Dispatchers.Main) {

              playVideo(videoPath)
          }

      }


    }

    //contamos los segundos en los cuales aparecerá el anuncio, para después
    suspend fun counPlayAdds(timeRandomadds:Int):Int{
        var auxTime = timeRandomadds
        while (auxTime > 0){
            auxTime--
            delay(1000)
        }
        return timeRandomadds
    }

    //gener aun numero aleatorio para definir en que momento se reproducira el anuncio
    fun generateTimeRandom(endTimeRandom: Int):Int{
        var rando = Random(System.nanoTime())
        var getTimeRandom = (0..endTimeRandom).random()
        return getTimeRandom
    }


    //Decremento de 5 a 0 para mostrar en botón
    suspend fun countBtn(){
        var count: Int = 5

        while (count >= 0) {
            binding.skipBtn.text = "Saltar anuncio en " + count--
            delay(1000)
            //habilitamos el botón cuando el contador haya llegado a cero
            if (count == 0){
                binding.skipBtn.isEnabled = true
            }

        }
    }

    //Reproduce un video
    suspend fun playVideo(pathVideo:Any?){
        videoView!!.setMediaController(mediaController)

        //obtenemos la duracion del video
        videoView!!.duration

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