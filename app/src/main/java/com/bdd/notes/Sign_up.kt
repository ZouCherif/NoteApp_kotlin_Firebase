package com.bdd.notes

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.bdd.notes.databinding.ActivitySignUpBinding

class Sign_up : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.toSignIn.setOnClickListener {
            val intent = Intent (this,Sign_in::class.java)
            startActivity(intent)
        }
    }
}