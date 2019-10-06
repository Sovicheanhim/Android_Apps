package com.example.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var br:BroadcastReceiver
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ifil = IntentFilter()
        ifil.addAction(Intent.ACTION_BATTERY_CHANGED)
        ifil.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED)

        var br = object: BroadcastReceiver(){
            override fun onReceive(p0: Context?, p1: Intent?) {
                Toast.makeText(this@MainActivity, p1?.action, Toast.LENGTH_SHORT).show()
            }
        }

        registerReceiver(br, ifil);
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(br)
    }

    override fun sendBroadcast(intent: Intent?) {
        super.sendBroadcast(intent)
        var i = Intent(this, this@MainActivity::class.java)
        sendBroadcast(i)
    }
}
