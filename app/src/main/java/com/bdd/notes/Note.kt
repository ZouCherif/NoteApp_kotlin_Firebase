package com.bdd.notes


import com.google.firebase.database.IgnoreExtraProperties
import java.util.Date

@IgnoreExtraProperties
data class Note(val title: String? = null, val body: String? = null, val time: Date) {

}