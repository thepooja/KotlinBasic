package com.example.kotlinbasic.practise.LiveData

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.kotlinbasic.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)

        val viewmodel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        viewmodel.startCounter()

        viewmodel.seconds().observe(this, Observer {
            textView.text = it.toString()
        })

        viewmodel.finished().observe(this, Observer {
            textView.text ="Finished"
        })

    }
}