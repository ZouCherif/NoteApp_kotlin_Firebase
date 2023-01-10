package com.bdd.notes

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val next1: Button = findViewById(R.id.next1)
        next1.setOnClickListener {
            val intent = Intent (this,Second::class.java)
            startActivity(intent)
        }
    }
}
