package com.example.bound_service

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder
import java.util.*

class MyService : Service() {

//  Create a service class
    inner class MyBinder: Binder() {
        fun getServiceObject(): MyService{
//            Function for returning Service
            return this@MyService
        }
    }

    var iBinder:Binder = MyBinder()
    override fun onBind(intent: Intent): IBinder {
        return iBinder
    }

    fun getBread():String{
        return "Bread"
    }

    fun getTime():String{
        return Date().toString()
    }
}
