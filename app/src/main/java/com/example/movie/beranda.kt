package com.example.movie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class beranda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beranda)

        val imageClick = findViewById<CardView>(R.id.touchCard1)
        imageClick.setOnClickListener {
            val intent = Intent(this, detail::class.java)
            startActivity(intent)
        }

    }
}