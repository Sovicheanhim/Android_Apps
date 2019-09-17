package com.example.custom_toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myToast = Toast(this)

    }
    fun showToast(view: View){
        var view = layoutInflater.inflate(R.layout.custom_toast, null)

        var myToast = Toast(this)
        myToast.duration = Toast.LENGTH_SHORT
        myToast.setGravity(Gravity.BOTTOM, 0, 30)
        myToast.view = view
        myToast.show()
    }
}
