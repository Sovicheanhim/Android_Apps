package com.example.switch_view

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        layoutMode.setBackgroundColor(Color.GRAY)
        themeSwitch.setOnCheckedChangeListener{_, isChecked->
            if(isChecked){
                layoutMode.setBackgroundColor(Color.DKGRAY)
                themeSwitch.text = "Theme : Dark Mode"
//                image_view.setImageResource(R.drawable.light_off)

            }
            else{
                layoutMode.setBackgroundColor(Color.GRAY)
                themeSwitch.text = "Theme : Light Mode"
//                image_view.setImageResource(R.drawable.light_on)
            }
    }
    }
}
