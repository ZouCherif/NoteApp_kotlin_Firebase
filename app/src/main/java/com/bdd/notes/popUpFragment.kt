package com.bdd.notes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase


class popUpFragment : DialogFragment() {
    private  lateinit var mDbRef: DatabaseReference
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pop_up, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val cancel = view.findViewById<Button>(R.id.cancelbtn)
        val delete = view.findViewById<Button>(R.id.detelebtn)
        cancel.setOnClickListener {
            dismiss()
        }
        delete.setOnClickListener {
            val dataPassed: String? = arguments?.getString("noteid")
            mDbRef = FirebaseDatabase.getInstance().getReference("users")
            mDbRef.child(FirebaseAuth.getInstance().currentUser?.uid!!).child("notes").child(dataPassed.toString()).removeValue()
            activity?.finish()
        }


    }



}