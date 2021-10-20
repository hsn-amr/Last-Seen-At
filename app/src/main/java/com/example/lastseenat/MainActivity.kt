package com.example.lastseenat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var tv :TextView
    
    override fun onStart() {
        super.onStart()
        tv = findViewById(R.id.tv)
        tv.text = "${tv.text}\nOnline"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onStop() {
        super.onStop()
        var time = Date()
        tv.text = "${tv.text}\nlast seen at $time"
    }
}