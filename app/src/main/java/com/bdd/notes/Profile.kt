package com.bdd.notes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.bdd.notes.databinding.ActivityMainScreenBinding
import com.bdd.notes.databinding.ActivityProfileBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*

class Profile : AppCompatActivity() {
    private lateinit var bindin: ActivityMainScreenBinding
    private lateinit var binding: ActivityProfileBinding

    private lateinit var firebaseAuth: FirebaseAuth
    private  lateinit var mDbRef: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)


        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val firebaseAuth = FirebaseAuth.getInstance()
        mDbRef = FirebaseDatabase.getInstance().getReference("users")

        mDbRef.child(firebaseAuth.currentUser?.uid!!).child("email").addValueEventListener(object: ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                val username = snapshot.getValue(String::class.java)
                binding.EmailTxt.setText(username)






            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }


        })
        mDbRef.child(firebaseAuth.currentUser?.uid!!).child("username").addValueEventListener(object: ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                val username = snapshot.getValue(String::class.java)
                binding.Username.setText(username)






            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }


        })


    }
}
