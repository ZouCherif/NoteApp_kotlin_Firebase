package com.bdd.notes

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class NotesAdapter(val context: Context, val noteList: ArrayList<Note>): RecyclerView.Adapter<NotesAdapter.NoteViewholder>() {
    override fun getItemCount(): Int {
        return noteList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewholder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.note_card, parent, false)
        return NoteViewholder(view)
    }
    override fun onBindViewHolder(holder: NoteViewholder, position: Int) {
        val currentNote = noteList[position]
        holder.title.text = currentNote.title
        holder.time.text = currentNote.time
        if(currentNote.body?.length!! > 80){
            val subbody= currentNote.body.substring(0, 49)
            holder.body.text = "$subbody..."
        }else{
            holder.body.text = currentNote.body
        }
        holder.itemView.setOnClickListener {
            val intent = Intent(context, modifyNote::class.java)
            intent.putExtra("body", currentNote.body)
            intent.putExtra("title", currentNote.title)
            intent.putExtra("noteid", currentNote.noteid)
            context.startActivity(intent)
        }
    }

    class NoteViewholder(itemView: View): RecyclerView.ViewHolder(itemView){
        val title: TextView = itemView.findViewById(R.id.title)
        val time: TextView = itemView.findViewById(R.id.time)
        val body: TextView = itemView.findViewById(R.id.noteTxt)
    }
}