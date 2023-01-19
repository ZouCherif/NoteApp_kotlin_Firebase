package com.bdd.notes

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class Settings : AppCompatActivity() {
    private companion object{
        private const val TAG="AppCompatActivity"
    }
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        auth=Firebase.auth
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        val btn1: Button = findViewById(R.id.Profile)
        btn1.setOnClickListener {
            val intent = Intent (this,Profile::class.java)
            startActivity(intent)
        }

        val btn2: Button = findViewById(R.id.Logout)
        btn2.setOnClickListener {
            Log.i(TAG,"Logout")
            auth.signOut()
            val intent = Intent (this,Sign_in::class.java)
            intent.flags=Intent.FLAG_ACTIVITY_NEW_TASK or  Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }
    }
}