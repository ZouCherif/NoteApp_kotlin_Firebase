package com.bdd.notes

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bdd.notes.databinding.ActivitySignInBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class Sign_in : AppCompatActivity() {
    private lateinit var binding: ActivitySignInBinding
    private lateinit var firebaseAuth: FirebaseAuth
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ToRegister.setOnClickListener{
            val intent = Intent(this, Sign_up::class.java)
            startActivity(intent)
            finish()
        }
        firebaseAuth = FirebaseAuth.getInstance()
        binding.signin.setOnClickListener{
            val email = binding.email.text.toString()
            val pass = binding.password.text.toString()

            if(email.isNotEmpty() && pass.isNotEmpty()){
                firebaseAuth.signInWithEmailAndPassword(email, pass)
                    .addOnSuccessListener {
                        if (firebaseAuth.currentUser!!.isEmailVerified) {
                            Toast.makeText(this, "Succesfully signed in", Toast.LENGTH_SHORT).show()
                            val intent2 = Intent(this, Main_screen::class.java)
                            startActivity(intent2)
                            finish()
                        }else{
                            Toast.makeText(this, "Please check your email", Toast.LENGTH_SHORT).show()
                            firebaseAuth.signOut()
                        }
                    }
                    .addOnFailureListener {
                        Toast.makeText(this, it.message, Toast.LENGTH_LONG)
                            .show()
                    }
            }else{
                Toast.makeText(this, "Empty fields are not allowed !!", Toast.LENGTH_LONG).show()
            }
        }

        binding.ForgotPass.setOnClickListener {
            val intent = Intent (this,ForgotPassword::class.java)
            startActivity(intent)
        }

    }

    override fun onStart() {
        super.onStart()
        val user = Firebase.auth.currentUser
        if (user != null){
            if (user.isEmailVerified) {
                val intent2 = Intent(this, Main_screen::class.java)
                startActivity(intent2)
                finish()
            }else{
                Toast.makeText(this, "Please check your email", Toast.LENGTH_LONG).show()
            }
        }
    }
}