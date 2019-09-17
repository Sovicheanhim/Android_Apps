package com.example.switch_sum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // get the data
        var intent = intent
        val first = intent.getIntExtra("first",0)
        val second = intent.getIntExtra("second", 0)

        var sum:Int = first + second


        val goBack = findViewById<Button>(R.id.GoBack)
        goBack.setOnClickListener{
            // creating intent to go back
            val i = Intent(this, MainActivity::class.java)
            i.putExtra("sum", sum)
            startActivity(i)
        }

    }
}
