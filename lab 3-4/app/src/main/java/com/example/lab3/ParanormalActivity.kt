package com.example.lab3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ParanormalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paranormal)

        val intentValue = intent.getStringExtra("Data")
        findViewById<TextView>(R.id.b2).apply{
            text = intentValue.toString()
        }
    }
}