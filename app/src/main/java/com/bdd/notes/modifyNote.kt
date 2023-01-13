package com.bdd.notes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bdd.notes.databinding.ActivityMainScreenBinding
import com.bdd.notes.databinding.ActivityModifyNoteBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class modifyNote : AppCompatActivity() {
    private lateinit var binding: ActivityModifyNoteBinding
    private  lateinit var mDbRef: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityModifyNoteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val body =  intent.getStringExtra("body")
        val title =  intent.getStringExtra("title")
        val noteid =  intent.getStringExtra("noteid")

        binding.body.setText(body)
        binding.title.setText(title)

        binding.modify.setOnClickListener {
            mDbRef = FirebaseDatabase.getInstance().getReference("users")
            val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
            val time = LocalDateTime.now().format(formatter)
            val note = Note(binding.title.text.toString(),
                    binding.body.text.toString(),
                    time,
                    noteid)
            mDbRef.child(FirebaseAuth.getInstance().currentUser?.uid!!).child("notes")
                .child(noteid!!).setValue(note).addOnSuccessListener {
                    Toast.makeText(this, "note successfully updated", Toast.LENGTH_SHORT).show()
                    finish()
                }
        }

        binding.delete.setOnClickListener{
            val args = Bundle()
            args.putString("noteid", noteid)
            val showPopUp = popUpFragment()
            showPopUp.arguments = args
            showPopUp.show(this.supportFragmentManager, "showPopUp")
        }
    }
}