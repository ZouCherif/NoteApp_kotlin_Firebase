package com.bdd.notes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import com.bdd.notes.databinding.ActivityForgotPasswordBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class ForgotPassword : AppCompatActivity() {
    private lateinit var firebaseAuth: FirebaseAuth
    private lateinit var binding:ActivityForgotPasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForgotPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)
        firebaseAuth = Firebase.auth
        binding.resetPass.setOnClickListener {
            val email = binding.email.text.toString()
                if (checkEmail()){
                    firebaseAuth.sendPasswordResetEmail(email).addOnSuccessListener {

                        // email is sent
                        Toast.makeText(this, "Check your email", Toast.LENGTH_SHORT).show()

                        val intent = Intent(this, Sign_in::class.java)
                        startActivity(intent)
                        // lets destroy this activity
                        finish()

                    }
                }

        }
    }

    private  fun checkEmail():Boolean {
        val email = binding.email.text.toString()
        if(email.isEmpty()){
            Toast.makeText(this, "Empty fields are not allowed", Toast.LENGTH_SHORT).show()
            return false
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            Toast.makeText(this, "Incorrect email format", Toast.LENGTH_SHORT).show()
            return false
        }

        return true
    }
}