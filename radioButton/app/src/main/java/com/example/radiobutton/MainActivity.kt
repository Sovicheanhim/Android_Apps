package com.example.radiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{
            val id = group.checkedRadioButtonId
            var text = ""
            when(id){
                R.id.Pizza ->{
                    text = "Pizza"
                }
                R.id.Salad ->{
                    text = "Salad"
                }
                R.id.Hamburger ->{
                    text = "Hamburger"
                }
            }
            Toast.makeText(this, "Item selected: $text", LENGTH_LONG).show()
        }
    }
}
