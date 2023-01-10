package com.bdd.notes

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Settings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        val btn1: Button = findViewById(R.id.Profile)
        btn1.setOnClickListener {
            val intent = Intent (this,Profile::class.java)
            startActivity(intent)
        }
    }
}