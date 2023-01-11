package com.bdd.notes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.bdd.notes.databinding.ActivityAddNoteBinding
import com.bdd.notes.databinding.ActivityMainScreenBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*

class Main_screen : AppCompatActivity() {
    private lateinit var binding: ActivityMainScreenBinding
    private lateinit var firebaseAuth: FirebaseAuth
    private  lateinit var mDbRef: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val firebaseAuth = FirebaseAuth.getInstance()
        mDbRef = FirebaseDatabase.getInstance().getReference("users")
        mDbRef.child(firebaseAuth.currentUser?.uid!!).child("username").addValueEventListener(object: ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                val username = snapshot.getValue(String::class.java)
                binding.username.setText(username)
            }
            override fun onCancelled(error: DatabaseError) {

            }

        })



        binding.Btn1.setOnClickListener {
            val intent = Intent (this,Settings::class.java)
            startActivity(intent)
        }
        binding.Add.setOnClickListener {
            val intent = Intent (this,Add_note::class.java)
            startActivity(intent)
        }
    }
}