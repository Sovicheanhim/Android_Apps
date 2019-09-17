package com.example.check_box

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{
            var order = ""
            if(pizza.isChecked)
                order += "Pizza!"
            if(hamburger.isChecked)
                order += "\nHamburger!"
            if(salad.isChecked)
                order += "\nSalad!"
            Toast.makeText(this, order, Toast.LENGTH_LONG).show()
        }
    }
}
