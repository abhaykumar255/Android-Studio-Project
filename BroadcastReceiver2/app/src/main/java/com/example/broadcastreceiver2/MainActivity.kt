package com.example.broadcastreceiver2

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var airplaneModeChangedReceiver = AirplaneModeChangedReceiver()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also {
            registerReceiver(airplaneModeChangedReceiver,it)
        }
    }


//    override fun onStart() {
//        super.onStart()
//    }
//
    override fun onStop() {
        super.onStop()
    unregisterReceiver(airplaneModeChangedReceiver)
    }
}