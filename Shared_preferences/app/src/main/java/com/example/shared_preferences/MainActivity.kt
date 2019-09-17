package com.example.shared_preferences

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pref = MyPref(this@MainActivity)
        var current_score = pref.getScore()
        var current_level = pref.getLevel()

        score.text = "Current Score : $current_score"
        level.text = "Current Level  : $current_level"

        plus_score.setOnClickListener{
            current_score++
            score.text = "Current Score : $current_score"
            pref.setScore(current_score)
        }
        plus_level.setOnClickListener{
            current_level++
            level.text = "Current Level  : $current_level"
            pref.setLevel(current_level)
        }

//        save.setOnClickListener(){
//            val intent = Intent(this, Another_Activity::class.java)
//            var name = getName.text.toString()
//            var email = getEmail.text.toString()
//            intent.putExtra("name", name)
//            intent.putExtra("email", email)
//            startActivity(intent)
//        }
    }
    fun saveInfo(v: View){
        val pref = MyPref(this@MainActivity)
        when(v.id){
            R.id.save -> {
                val name = getName.text.toString()
                val email = getEmail.text.toString()
                pref.setName(name)
                pref.setEmail(email)
//                Log.d(name, "true")
//                Log.d(email, "true")
            }
            R.id.retrieve -> {
                val name = pref.getName()
                val email = pref.getEmail()
//                Log.d(name, "true")
//                Log.d(email, "true")
                getName.setText(name)
                getEmail.setText(email)
            }
            R.id.clear ->{
                getName.setText("")
                getEmail.setText("")
            }
        }
    }

}
