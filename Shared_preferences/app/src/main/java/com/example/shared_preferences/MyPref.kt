package com.example.shared_preferences

import android.content.Context

class MyPref(context: Context){
    val SCORE = "score"
    val LEVEL = "level"
    val NAME = "name"
    val EMAIL = "email"
    val PREF = "myFirstPref"
    val pref = context.getSharedPreferences(PREF, Context.MODE_PRIVATE)
    val editor = pref.edit()
    fun getScore():Int{
        var score = pref.getInt(SCORE, 0)
        return score
    }

    fun setScore(score:Int){
        editor.putInt(SCORE, score)
        editor.apply()
    }

    fun getLevel():Int{
        var level = pref.getInt(LEVEL, 0)
        return level
    }

    fun setLevel(score:Int){
        editor.putInt(LEVEL, score)
        editor.apply()
    }
    fun setName(name:String){
        editor.putString(NAME, name)
        editor.apply()
    }
    fun getName():String{
        var name = pref.getString(NAME, "").toString()
        return name
    }
    fun setEmail(email:String){
        editor.putString(EMAIL, email)
        editor.apply()
    }
    fun getEmail():String{
        var email = pref.getString(NAME, "").toString()
        return email
    }
}