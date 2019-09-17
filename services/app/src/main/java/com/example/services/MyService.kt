package com.example.services

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

class MyService : Service() {

    var player:MediaPlayer? = null

    override fun onBind(p0: Intent?): IBinder? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate() {
        super.onCreate()
        player = MediaPlayer.create(this, R.raw.love)
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        player?.start()
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        player?.stop()
        super.onDestroy()
    }
}