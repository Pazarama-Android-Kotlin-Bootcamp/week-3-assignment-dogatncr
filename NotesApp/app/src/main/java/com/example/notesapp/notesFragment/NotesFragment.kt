package com.example.notesapp.notesFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.notesapp.R
import com.example.notesapp.data.NoteModel
import com.example.notesapp.data.mockNotesData

class NotesFragment: Fragment(), NotesListener {
    private lateinit var notesRecyclerView: RecyclerView
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_notes, container, false)

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = findNavController()
        notesRecyclerView = view.findViewById(R.id.notesList)
        setupAdapter()
    }
    private fun setupAdapter() {
        notesRecyclerView.adapter = NotesAdapter(mockNotesData, this)

    }

    override fun onClicked(note: NoteModel) {
        navController.navigate(R.id.action_notesFragment_to_placeholder, Bundle().apply {
            putString("noteModel", "note.toJson()")
        })
    }
}