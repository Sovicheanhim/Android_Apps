package com.example.seekbarcolor

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.SeekBar
import com.example.seekbarcolor.R.id
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        alpha.max = 255
        red.max = 255
        green.max = 255
        blue.max = 255
    }
    fun changeColor(view: View) {
        class CommonListener: SeekBar.OnSeekBarChangeListener {

            var al = 255
            var redColor = 0
            var blueColor = 0
            var greenColor = 0
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                    when (p0?.id) {
                        id.alpha -> {
                            al = p1
                            alphaText.text = "Opacity: ${p0.progress}"
                            alphaText.setTextColor(Color.argb(al, 0, 0, 0))
                        }
                        id.red -> {
                            redColor = p1
                            redText.text = "Red: ${p0.progress}"
                            redText.setTextColor(Color.argb(255, redColor, 0, 0))
                        }
                        id.green -> {
                            greenColor = p1
                            greenText.text = "Green: ${p0.progress}"
                            greenText.setTextColor(Color.argb(255, 0, greenColor, 0))
                        }
                        id.blue -> {
                            blueColor = p1
                            blueText.text = "Blue: ${p0.progress}"
                            blueText.setTextColor(Color.argb(255, 0, 0, blueColor))
                        }
                    }
                        var myCol = Color.argb(al, redColor, greenColor, blueColor)
                    when (view.id) {
                        R.id.redButton -> redButton.setBackgroundColor(myCol)
                        R.id.blueButton -> blueButton.setBackgroundColor(myCol)
                        R.id.greenButton -> greenButton.setBackgroundColor(myCol)
                    }
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }
        }
        val commonListener = CommonListener()

        alpha.setOnSeekBarChangeListener(commonListener)
        red.setOnSeekBarChangeListener(commonListener)
        green.setOnSeekBarChangeListener(commonListener)
        blue.setOnSeekBarChangeListener(commonListener)
    }
}
