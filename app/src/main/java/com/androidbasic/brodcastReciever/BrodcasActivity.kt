package com.androidbasic.brodcastReciever

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinbasic.R

class BrodcasActivity : AppCompatActivity() {

    lateinit var recevier: AirplaneModeChangeRecevier

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_brodcas)

        recevier = AirplaneModeChangeRecevier()

        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also {
            registerReceiver(recevier,it)
        }
    }

    override fun onStop() {
        super.onStop()

        unregisterReceiver(recevier)
    }
}