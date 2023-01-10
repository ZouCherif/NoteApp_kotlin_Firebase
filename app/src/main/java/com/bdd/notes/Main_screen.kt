package com.bdd.notes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        val btn1: Button = findViewById(R.id.Btn1)
        btn1.setOnClickListener {
            val intent = Intent (this,Settings::class.java)
            startActivity(intent)
        }
        val add: Button = findViewById(R.id.Add)
        add.setOnClickListener {
            val intent = Intent (this,Add_note::class.java)
            startActivity(intent)
        }
    }
}