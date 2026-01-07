package com.example.notezew.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.notezew.model.Note

class NoteViewModel : ViewModel() {
    private val _notes = mutableStateListOf<Note>()
    val notes: List<Note> = _notes

    fun addNote(title: String, content: String) {
        if (title.isBlank() && content.isBlank()) return
        _notes.add(Note(title = title, content = content))
    }

    fun deleteNote(note: Note) {
        _notes.remove(note)
    }
}
