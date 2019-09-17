package com.example.switch_sum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstnum = findViewById<EditText>(R.id.firstnum)
        val secondnum = findViewById<EditText>(R.id.secondnum)
        val sum = findViewById<Button>(R.id.sum)
        // getting value from intent
        var i = intent
        val result = i.getIntExtra("sum", 0).toString()
        Result.text = "The result is $result"

        sum.setOnClickListener{
            var first = firstnum.text.toString().toInt()
            var second = secondnum.text.toString().toInt()


            // starting intent
            val intent = Intent(this, Main2Activity::class.java)
            intent.putExtra("first", first)
            intent.putExtra("second", second)
            startActivity(intent)
        }
    }
}
