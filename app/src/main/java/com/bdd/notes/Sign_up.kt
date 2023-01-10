package com.bdd.notes

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Sign_up : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        val btn1: Button = findViewById(R.id.SignIn)
        btn1.setOnClickListener {
            val intent = Intent (this,Sign_in::class.java)
            startActivity(intent)
        }
    }
}