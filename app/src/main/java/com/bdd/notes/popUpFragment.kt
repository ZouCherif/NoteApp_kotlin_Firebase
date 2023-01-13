package com.bdd.notes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.DialogFragment


class popUpFragment : DialogFragment() {

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
            Toast.makeText(context, "this is the delete button", Toast.LENGTH_SHORT).show()
        }

    }




}