package com.example.giftshop

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class homepage : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_homepage)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.title1)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }

        val imggidtid = findViewById<ImageView>(R.id.imggidtid)
        imggidtid.setOnClickListener() {

            val intent = Intent(this,Gifts::class.java)
            startActivity(intent)
        }

        val imgprofilepichome = findViewById<ImageView>(R.id.imgprofilepichome)
        imgprofilepichome.setOnClickListener() {

            val intent = Intent(this,profile::class.java)
            startActivity(intent)
        }

        val btnordernow = findViewById<Button>(R.id.btnordernow)
        btnordernow.setOnClickListener() {

            val intent = Intent(this,Gifts::class.java)
            startActivity(intent)
        }

        val imgteddydashboard = findViewById<ImageView>(R.id.imgteddydashboard)
        imgteddydashboard.setOnClickListener() {

            val intent = Intent(this,showdetails::class.java)
            startActivity(intent)
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