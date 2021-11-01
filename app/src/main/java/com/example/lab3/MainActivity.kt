package com.example.lab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editText)
        val button = findViewById<Button>(R.id.addBtn)
        button.setOnClickListener{
            val intent = Intent(this, ParanormalActivity::class.java).apply {
                putExtra("Data", editText.text.toString())
            }
            startActivity(intent)
        }
    }
}