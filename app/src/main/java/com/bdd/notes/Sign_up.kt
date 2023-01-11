package com.bdd.notes

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bdd.notes.databinding.ActivitySignUpBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.ktx.Firebase

class Sign_up : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    private lateinit var firebaseAuth: FirebaseAuth
    private  lateinit var mDbRef: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.ToLogin.setOnClickListener {
            val intent = Intent (this,Sign_in::class.java)
            startActivity(intent)
            finish()
        }

        firebaseAuth = FirebaseAuth.getInstance()
        binding.CreateAccount.setOnClickListener{
            val email = binding.email.text.toString()
            val pass = binding.password.text.toString()
            val username = binding.Username.text.toString()

            if(email.isNotEmpty() && pass.isNotEmpty() && username.isNotEmpty()){
                firebaseAuth.createUserWithEmailAndPassword(email, pass)
                    .addOnSuccessListener {
                        firebaseAuth.currentUser?.sendEmailVerification()
                        addUserToDB(username, email, firebaseAuth.currentUser?.uid!!)
                        val intent = Intent(this, Sign_in::class.java)
                        startActivity(intent)
                        finish()
                    }
                    .addOnFailureListener {
                        Toast.makeText(this, it.message ,Toast.LENGTH_LONG)
                            .show()
                    }
            }else{
                Toast.makeText(this, "Empty fields are not allowed !!", Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun addUserToDB(username: String, email: String, uid: String){
        mDbRef = FirebaseDatabase.getInstance().getReference("users")
        val user = User(username, email)
        mDbRef.child(uid).setValue(user).addOnSuccessListener {
            Toast.makeText(this, "Please Chek your email", Toast.LENGTH_LONG).show()
            Firebase.auth.signOut()
        }
            .addOnFailureListener {
                Toast.makeText(this, "error", Toast.LENGTH_LONG).show()
            }


        //to solve the probleme of adding users to DB
        //Download an updated google-services.json and use that in your app, or
        //Provide the database URL in your code with FirebaseDatabase database = FirebaseDatabase.getInstance("database URL here");

    }


}