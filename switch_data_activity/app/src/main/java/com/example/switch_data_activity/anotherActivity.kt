package com.example.switch_data_activity

import android.app.Activity
import android.app.Activity.RESULT_OK
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_another.*

class anotherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_another)
    }
    fun GoHome(v: View){
        val i = Intent(this, MainActivity::class.java)
        val goText = findViewById<TextView>(R.id.str)
        var result = goText.text.toString()
        intent.putExtra("string", result)
        setResult(RESULT_OK, i)
        startActivityForResult(i, 2)
    }
}
