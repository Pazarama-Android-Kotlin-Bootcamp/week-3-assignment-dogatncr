package com.example.notesapp.data

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import com.google.gson.Gson
import android.widget.TextView
import androidx.versionedparcelable.VersionedParcelize
import com.example.notesapp.R

/**
 * Created by dogatncr on 4.10.2022
 */

@Parcelize
data class NoteModel (
    val NoteId :String,
    val NoteFooter:String,
    val NoteHeader:String,
    val NoteDetailHeader: String,
    val NoteBody: String
) : Parcelable {
    fun toJson(): String {
        return Gson().toJson(this)
    }
    companion object {
        fun fromJson(jsonValue: String): NoteModel {
            return Gson().fromJson(jsonValue, NoteModel::class.java)
        }
    }
}

val mockNotesData = mutableListOf<NoteModel>(
    NoteModel(
        "1",
        "Note1",
        "1st note",
        NoteDetailHeader= "Title1",
        NoteBody= "jfbnfdjnls",
     ),
    NoteModel(
        "2",
        "Note2",
        "2nd note",
        NoteDetailHeader= "Title2",
        NoteBody= "jfbnfdıfyyıjnls",

    ),
    NoteModel(
        "3",
        "Note3",
        "3rd note",
        NoteDetailHeader= "Title3",
        NoteBody= "jfbnffkhvbabkhdbdıfyyıjnlsvfbkdjvfkvbavbfşabjadbavojrvbufdskdefjhrgbndmklömnbvfrtyuıopoıuytresdfghuıopşlknbvcdres"
    ),
    NoteModel(
        "1",
        "Note1",
        "1st note",
        NoteDetailHeader= "Title1",
        NoteBody= "jfbnfdjnls",
    ),
    NoteModel(
        "2",
        "Note2",
        "2nd note",
        NoteDetailHeader= "Title2",
        NoteBody= "jfbnfdıfyyıjnls",

        ),
    NoteModel(
        "3",
        "Note3",
        "3rd note",
        NoteDetailHeader= "Title3",
        NoteBody= "jfbnffkhvbabkhdbdıfyyıjnlsvfbkdjvfkvbavbfşabjadbavojrvbufdskdefjhrgbndmklömnbvfrtyuıopoıuytresdfghuıopşlknbvcdres"
    ),
    NoteModel(
        "1",
        "Note1",
        "1st note",
        NoteDetailHeader= "Title1",
        NoteBody= "jfbnfdjnls",
    ),
    NoteModel(
        "2",
        "Note2",
        "2nd note",
        NoteDetailHeader= "Title2",
        NoteBody= "jfbnfdıfyyıjnls",

        ),
    NoteModel(
        "3",
        "Note3",
        "3rd note",
        NoteDetailHeader= "Title3",
        NoteBody= "jfbnffkhvbabkhdbdıfyyıjnlsvfbkdjvfkvbavbfşabjadbavojrvbufdskdefjhrgbndmklömnbvfrtyuıopoıuytresdfghuıopşlknbvcdres"
    ),
    NoteModel(
        "1",
        "Note1",
        "1st note",
        NoteDetailHeader= "Title1",
        NoteBody= "jfbnfdjnls",
    ),
    NoteModel(
        "2",
        "Note2",
        "2nd note",
        NoteDetailHeader= "Title2",
        NoteBody= "jfbnfdıfyyıjnls",

        ),
    NoteModel(
        "3",
        "Note3",
        "3rd note",
        NoteDetailHeader= "Title3",
        NoteBody= "jfbnffkhvbabkhdbdıfyyıjnlsvfbkdjvfkvbavbfşabjadbavojrvbufdskdefjhrgbndmklömnbvfrtyuıopoıuytresdfghuıopşlknbvcdres"
    ),
    NoteModel(
        "1",
        "Note1",
        "1st note",
        NoteDetailHeader= "Title1",
        NoteBody= "jfbnfdjnls",
    ),
    NoteModel(
        "2",
        "Note2",
        "2nd note",
        NoteDetailHeader= "Title2",
        NoteBody= "jfbnfdıfyyıjnls",

        ),
    NoteModel(
        "3",
        "Note3",
        "3rd note",
        NoteDetailHeader= "Title3",
        NoteBody= "jfbnffkhvbabkhdbdıfyyıjnlsvfbkdjvfkvbavbfşabjadbavojrvbufdskdefjhrgbndmklömnbvfrtyuıopoıuytresdfghuıopşlknbvcdres"
    ),
    NoteModel(
        "1",
        "Note1",
        "1st note",
        NoteDetailHeader= "Title1",
        NoteBody= "jfbnfdjnls",
    ),
    NoteModel(
        "2",
        "Note2",
        "2nd note",
        NoteDetailHeader= "Title2",
        NoteBody= "jfbnfdıfyyıjnls",

        ),
    NoteModel(
        "3",
        "Note3",
        "3rd note",
        NoteDetailHeader= "Title3",
        NoteBody= "jfbnffkhvbabkhdbdıfyyıjnlsvfbkdjvfkvbavbfşabjadbavojrvbufdskdefjhrgbndmklömnbvfrtyuıopoıuytresdfghuıopşlknbvcdres"
    ),
)