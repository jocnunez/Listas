package com.jose.listas

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.google.android.material.textfield.TextInputEditText
import com.jocnunez.listas.R

class ItemDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_item_detail, container, false)

        val cancelButton = view.findViewById<Button>(R.id.cancelItemButton)
        val deleteButton = view.findViewById<Button>(R.id.deleteItemButton)
        val saveButton = view.findViewById<Button>(R.id.saveItemButton)
        cancelButton.setOnClickListener { cancelButtonHandler(view) }
        deleteButton.setOnClickListener { deleteButtonHandler(view) }
        saveButton.setOnClickListener { saveButtonHandler(view) }

        return view
    }

    private fun cancelButtonHandler(view: View) {
        val title = view.findViewById<TextInputEditText>(R.id.titleField)
        val description = view.findViewById<TextInputEditText>(R.id.descriptionField)

        title.setText("")
        description.setText("")
    }

    private fun deleteButtonHandler(view: View) {
        Log.d("ItemDetail", "Click on Delete Button: ")
    }

    private fun saveButtonHandler(view: View) {
        Log.d("ItemDetail", "Click on Save Button")
    }
}