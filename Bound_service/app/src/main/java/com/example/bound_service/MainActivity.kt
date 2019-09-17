package com.example.bound_service

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.IBinder
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var serviceObject:MyService? = null
    var sc:ServiceConnection = object : ServiceConnection{
        override fun onServiceDisconnected(p0: ComponentName?) {

        }

        override fun onServiceConnected(p0: ComponentName?, p1: IBinder?) {
            val myBinder:MyService.MyBinder = p1 as MyService.MyBinder
            serviceObject = myBinder.getServiceObject()
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val i = Intent(this,MyService::class.java)
        bindService(i, sc,Context.BIND_AUTO_CREATE)
    }

    fun getBread(v: View){
        text_view.text = serviceObject?.getTime()
    }
}
