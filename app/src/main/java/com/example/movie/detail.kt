package com.example.movie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val buttonClick = findViewById<Button>(R.id.buytix)
        buttonClick.setOnClickListener {
            val intent = Intent(this, payment::class.java)
            startActivity(intent)
        }

        val backClick = findViewById<ImageView>(R.id.backButton)
        backClick.setOnClickListener {
            val intent = Intent(this, beranda::class.java)
            startActivity(intent)
        }

    }
}