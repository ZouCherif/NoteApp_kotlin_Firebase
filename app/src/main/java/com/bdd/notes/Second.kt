package com.bdd.notes

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Second : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val next2: Button = findViewById(R.id.next2)
        next2.setOnClickListener {
            val intent = Intent (this,Third::class.java)
            startActivity(intent)
        }
        val back: Button = findViewById(R.id.back)
        back.setOnClickListener {
            val intent = Intent (this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}