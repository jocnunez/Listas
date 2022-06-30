package com.jose.listas

import android.content.Context
import android.util.Log
import java.io.File

class ListService(context: Context) {

    val context = context
    val fileName = "lists.txt"
    val file = File(context.filesDir, fileName)
    var list = mutableListOf<String>()


    // Obtener datos del fichero local lists.txt
    fun getListFromFile():MutableList<String> {
        if (!file.exists()) {
            file.createNewFile()
        }

        list = mutableListOf<String>()
        file.useLines {
            Log.d("Debug", "it: " + it)
            list.add(it.toString())
        }
        Log.d("Listas", "filesDir: " + context.filesDir)
        return list
    }

    fun addItemToList(item: String) {
        list.add(item)
        file.printWriter().use {
            out -> list.forEach {
                out.println(it)
            }
        }
    }
}