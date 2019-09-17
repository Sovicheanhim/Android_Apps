package com.example.progressbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.constraintlayout.solver.widgets.ConstraintWidget.GONE
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(progressBar != null){
            button.setOnClickListener{
                val visibility  = if(progressBar.visibility == View.GONE) View.VISIBLE else View.GONE
                progressBar.visibility = visibility

                button.text = if(progressBar.visibility == View.GONE) "Show Progressbar" else "Hide ProgressBar"
            }
        }
    }
}
