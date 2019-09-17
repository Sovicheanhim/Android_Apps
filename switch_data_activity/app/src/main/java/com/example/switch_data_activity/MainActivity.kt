package com.example.switch_data_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val result = findViewById<TextView>(R.id.viewText)
        result.text = "The result is $text"
    }
    fun Switch(v: View){
        val i = Intent(this, anotherActivity::class.java)
        val text = intent.getStringExtra("string").toString()
        startActivity(i)
    }
}
