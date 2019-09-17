package com.example.videoplayer

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val fileLocation = "android.resource://" + packageName + "/raw/" + R.raw.love

        val display = findViewById<View>(R.id.screen) as VideoView
        display.setVideoURI(Uri.parse(fileLocation))
        display.setMediaController(MediaController(this))
        display.start()
    }


}
