package com.jose.listas

import java.text.SimpleDateFormat
import java.time.Instant

data class Item(
    val title: String,
    val description: String = "",
    val date: Long = Instant.now() as Long,
    val check: Boolean = false
) {
    fun getFormattedDate():String {
        val format = SimpleDateFormat("dd-MM-yyyy")
        return format.format(date)
    }
}

