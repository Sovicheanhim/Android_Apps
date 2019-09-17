package com.example.gestures

//import android.support.v7.app.AppCompatActivity
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import androidx.core.view.GestureDetectorCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    override fun onLongPress(p0: MotionEvent?) {
        tv.text = "Long Press..."
        page.setBackgroundColor(Color.CYAN)
    }

    override fun onDoubleTap(p0: MotionEvent?): Boolean {
        tv.text = "Double Tapped..."
        return true
    }

    override fun onDoubleTapEvent(p0: MotionEvent?): Boolean {
        tv.text = "Double Tapped Event..."
        return true
    }

    override fun onSingleTapConfirmed(p0: MotionEvent?): Boolean {
        tv.text = "Single Tapped..."
        return true
    }

    var gdc: GestureDetectorCompat? = null
    override fun onShowPress(p0: MotionEvent?) {
        tv.text = "Show Press..."
        page.setBackgroundColor(Color.BLUE)
    }

    override fun onSingleTapUp(p0: MotionEvent?): Boolean {
        tv.text = "Key Down..."
        page.setBackgroundColor(Color.GREEN)
        return true
    }

    override fun onDown(p0: MotionEvent?): Boolean {
        tv.text = "Key Down..."
        page.setBackgroundColor(Color.YELLOW)
        return true
    }

    override fun onFling(p0: MotionEvent?, p1: MotionEvent?, p2: Float, p3: Float): Boolean {
        tv.text = "Flinging..."
        page.setBackgroundColor(Color.GRAY)
        return true
    }

    override fun onScroll(p0: MotionEvent?, p1: MotionEvent?, p2: Float, p3: Float): Boolean {
        tv.text = "Scrolling..."
        page.setBackgroundColor(Color.DKGRAY)
        return true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gdc = GestureDetectorCompat(this, this)
        gdc?.setOnDoubleTapListener(this)
    }
}

//package com.example.gesture
//
//import android.graphics.Color
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.view.GestureDetector
//import android.view.MotionEvent
//import androidx.core.view.GestureDetectorCompat
//import com.example.gestures.R
//import kotlinx.android.synthetic.main.activity_main.*
//
//class MainActivity : AppCompatActivity(), GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener
//{
//    var gdc:GestureDetectorCompat? = null
//    override fun onShowPress(p0: MotionEvent?) {
//        tv.text = "Show Press"
//        page.setBackgroundColor(Color.BLUE)
//    }
//
//    override fun onSingleTapUp(p0: MotionEvent?): Boolean {
//        tv.text = "Single Tap"
//        page.setBackgroundColor(Color.YELLOW)
//        return true
//    }
//
//    override fun onDown(p0: MotionEvent?): Boolean {
//        tv.text = "On Down"
//        page.setBackgroundColor(Color.GREEN)
//        return true
//    }
//
//    override fun onFling(p0: MotionEvent?, p1: MotionEvent?, p2: Float, p3: Float): Boolean {
//        tv.text = "On Fling"
//        page.setBackgroundColor(Color.GRAY)
//        return true
//    }
//
//    override fun onScroll(p0: MotionEvent?, p1: MotionEvent?, p2: Float, p3: Float): Boolean {
//        tv.text = "On Scroll"
//        page.setBackgroundColor(Color.CYAN)
//        return true
//    }
//
//    override fun onLongPress(p0: MotionEvent?) {
//        tv.text = "On Long Press"
//        page.setBackgroundColor(Color.WHITE)
//    }
//
//    override fun onDoubleTap(p0: MotionEvent?): Boolean {
//        tv.text = "On Double Tap"
//        page.setBackgroundColor(Color.RED)
//        return true
//    }
//
//    override fun onDoubleTapEvent(p0: MotionEvent?): Boolean {
//        tv.text = "On Double Tap Event"
//        page.setBackgroundColor(Color.CYAN)
//        return true
//    }
//
//    override fun onSingleTapConfirmed(p0: MotionEvent?): Boolean {
//        tv.text = "On Single Tap Confirmed"
//        page.setBackgroundColor(Color.MAGENTA)
//        return true
//    }
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        gdc = GestureDetectorCompat(this, this)
//        gdc?.setOnDoubleTapListener(this)
//    }
//}

