package com.bdd.notes

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Third : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        val start: Button = findViewById(R.id.start)
        start.setOnClickListener {
            val intent = Intent (this,Sign_in::class.java)
            startActivity(intent)
        }
    }
}