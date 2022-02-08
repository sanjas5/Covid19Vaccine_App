package com.example.covidvaccineapp.view

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.MediaController
import android.widget.VideoView
import com.example.covidvaccineapp.MainActivity
import com.example.covidvaccineapp.R

class VideoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)


        val mediaController =  MediaController(this)
        val videoView = findViewById<VideoView>(R.id.videoView)
        mediaController.setAnchorView(videoView)
        //val onlineUri = Uri.parse("https://www.youtube.com/watch?v=k3y1hJPVavY")
        val offlineUri = Uri.parse("android.resource://$packageName/${R.raw.what_you_love_15}")


        videoView.setMediaController(mediaController)
        videoView.setVideoURI(offlineUri)
        videoView.requestFocus()
        videoView.start()

        // vracamo se na prvi fragment
        var back_button = findViewById(R.id.back_button) as Button
        back_button.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, InfoActivity::class.java)
            startActivity(intent);


        }

    }
}