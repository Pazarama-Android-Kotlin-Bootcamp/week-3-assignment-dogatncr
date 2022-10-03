package com.example.notesapp.notesFragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.notesapp.R
import com.example.notesapp.data.NoteModel

class NotesAdapter (
    private val notesList: MutableList<NoteModel>,
    private val listener: NotesListener
) : RecyclerView.Adapter<NotesAdapter.NotesViewHolder>()  {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): NotesAdapter.NotesViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.notes_item, parent, false)
        return NotesViewHolder(view)
    }

    override fun onBindViewHolder(holder: NotesAdapter.NotesViewHolder, position: Int) {
        holder.bind(notesList[position], listener)
    }

    override fun getItemCount(): Int {
        return notesList.size
    }
    class NotesViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val noteId = view.findViewById<TextView>(R.id.NoteId)
        private val noteFooter = view.findViewById<TextView>(R.id.NoteFooter)
        private val noteHeader = view.findViewById<TextView>(R.id.NoteHeader)

        fun bind(note: NoteModel, listener: NotesListener) {
            noteId.text = note.NoteId
            noteFooter.text = note.NoteFooter
            noteHeader.text = note.NoteHeader

            itemView.setOnClickListener {
                listener.onClicked(note)
            }

        }
    }
}
interface NotesListener {
    fun onClicked(note: NoteModel)
}