package com.example.giftshop

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val navcart = findViewById<ImageView>(R.id.navcart)
        navcart.setOnClickListener() {

            val intent = Intent(this,cart::class.java)
            startActivity(intent)
        }

        val navhome = findViewById<ImageView>(R.id.navhome)
        navhome.setOnClickListener() {

            val intent = Intent(this,homepage::class.java)
            startActivity(intent)
        }

        val navprofile = findViewById<ImageView>(R.id.navprofile)
        navprofile.setOnClickListener() {

            val intent = Intent(this,profile::class.java)
            startActivity(intent)
        }
    }
}