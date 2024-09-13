package com.example.giftshop

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class showdetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_showdetails)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.title1)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnaddtocart = findViewById<Button>(R.id.btnaddtocart)
        btnaddtocart.setOnClickListener() {

            val intent = Intent(this,cart::class.java)
            startActivity(intent)
        }
    }
}