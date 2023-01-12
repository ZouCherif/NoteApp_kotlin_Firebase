package com.bdd.notes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bdd.notes.databinding.ActivityMainScreenBinding
import com.bdd.notes.databinding.ActivityModifyNoteBinding

class modifyNote : AppCompatActivity() {
    private lateinit var binding: ActivityModifyNoteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityModifyNoteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val body =  intent.getStringExtra("body")
        val title =  intent.getStringExtra("title")
        val noteid =  intent.getStringExtra("noteid")

        binding.body.setText(body)
        binding.title.setText(title)
    }
}