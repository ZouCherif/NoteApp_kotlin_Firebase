package com.bdd.notes

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bdd.notes.databinding.ActivitySignUpBinding
import com.google.firebase.auth.FirebaseAuth

class Sign_up : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.toSignIn.setOnClickListener {
            val intent = Intent (this,Sign_in::class.java)
            startActivity(intent)
            finish()
        }

        firebaseAuth = FirebaseAuth.getInstance()
        binding.SignUp.setOnClickListener{
            val email = binding.email.text.toString()
            val pass = binding.password.text.toString()
            val username = binding.username.text.toString()

            if(email.isNotEmpty() && pass.isNotEmpty() && username.isNotEmpty()){
                firebaseAuth.createUserWithEmailAndPassword(email, pass)
                    .addOnSuccessListener {
                        firebaseAuth.currentUser?.sendEmailVerification()
                        //addUserToDB(username, email, firebaseAuth.currentUser?.uid!!)
                        val intent = Intent(this, MainActivity::class.java)
                        startActivity(intent)
                        finish()
                    }
                    .addOnFailureListener {
                        Toast.makeText(this, it.message ,Toast.LENGTH_LONG)
                            .show()
                    }
            }else{
                Toast.makeText(this, "empty fields are not allowed !!", Toast.LENGTH_LONG).show()
            }
        }





    }
}