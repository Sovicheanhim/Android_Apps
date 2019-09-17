package com.example.rating_bar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RatingBar
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),RatingBar.OnRatingBarChangeListener {

    var starPoint = ""
    override fun onRatingChanged(p0: RatingBar?, p1: Float, p2: Boolean) {
        display.text = "${p1.toInt()}"
        starPoint = "You selected : ${p1.toInt()}"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ratingBar.onRatingBarChangeListener = this

        getStar.setOnClickListener {
            Toast.makeText(this, starPoint, Toast.LENGTH_SHORT).show()
        }
    }


}
