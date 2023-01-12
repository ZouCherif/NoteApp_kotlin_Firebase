package com.bdd.notes


import com.google.firebase.database.Exclude
import com.google.firebase.database.IgnoreExtraProperties
import java.time.LocalDateTime

@IgnoreExtraProperties
data class Note(val title: String? = null, val body: String? = null, val time: String? = null, val noteid: String? = null) {
    @Exclude
    fun toMap(): Map<String, Any?> {
        return mapOf(
            "title" to title,
            "body" to body,
            "time" to time,
            "noteid" to noteid
        )
    }
}