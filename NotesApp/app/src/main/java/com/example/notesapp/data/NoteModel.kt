package com.example.notesapp.data

import android.widget.TextView
import com.example.notesapp.R

data class NoteModel (
    val NoteId :String,
    val NoteFooter:String,
    val NoteHeader:String,
)

val mockNotesData = mutableListOf<NoteModel>(
    NoteModel(
        "1",
        "Book1",
        "Author1",
     ),
    NoteModel(
        "2",
        "Book1",
        "Author1",
    ),
    NoteModel(
        "3",
        "Book1",
        "Author1",
    ),

)   
   
