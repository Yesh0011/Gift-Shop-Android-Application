package com.example.giftshop

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class getstartedpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContentView(R.layout.activity_getstartedpage)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.title1)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
        val btngetstarted = findViewById<Button>(R.id.btngetstarted)
        btngetstarted.setOnClickListener() {

            val intent = Intent(this,homepage::class.java)
            startActivity(intent)
        }

    }
}