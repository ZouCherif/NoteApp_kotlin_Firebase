package com.bdd.notes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bdd.notes.databinding.ActivityAddNoteBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import java.time.LocalDateTime

class Add_note : AppCompatActivity() {
    private lateinit var binding: ActivityAddNoteBinding
    private lateinit var mDbRef: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddNoteBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.savebtn.setOnClickListener{
            val title = binding.title.text.toString()
            val body = binding.body.text.toString()
            val time = LocalDateTime.now()

            if (title.isNotEmpty() && body.isNotEmpty()){
                addNoteToDB(title, body, time, FirebaseAuth.getInstance().currentUser?.uid)
            }
        }
    }

    private fun addNoteToDB(title: String?, body: String?, time: LocalDateTime, uid: String?){
        mDbRef = FirebaseDatabase.getInstance().getReference("users")
        val key = mDbRef.child(uid!!).child("notes").push().key
        val note = Note(title, body, time)
        mDbRef.child(uid).child("notes").child(key!!).setValue(note).addOnSuccessListener {
            finish()
        }.addOnFailureListener {
            Toast.makeText(this, "error", Toast.LENGTH_LONG).show()
        }

    }
}