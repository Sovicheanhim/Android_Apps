package com.example.services

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RatingBar
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun startAndStop(view: View){
        val i = Intent(this,MyService::class.java)
        when(view.id){
            R.id.button1 -> {
                startService(i)
            }
            R.id.button2 -> {
                stopService(i)
            }
        }
    }

}
