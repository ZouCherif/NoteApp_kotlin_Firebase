package com.bdd.notes

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Sign_in : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val btn1: Button = findViewById(R.id.SignUp)
        btn1.setOnClickListener {
            val intent = Intent (this,Sign_up::class.java)
            startActivity(intent)
        }
        val log: Button = findViewById(R.id.Log)
        log.setOnClickListener {
            val intent = Intent (this,Main_screen::class.java)
            startActivity(intent)
        }
    }
}