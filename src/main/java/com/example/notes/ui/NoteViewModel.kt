package com.example.notes.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.notes.persistence.Note
import com.example.notes.repository.NoteRepository
import javax.inject.Inject

class NoteViewModel @Inject constructor(
    val noteRepository: NoteRepository
) : ViewModel() {


    fun insert(note: Note) {
        return noteRepository.insert(note)
    }


    fun delete(note: Note) {
        noteRepository.delete(note)
    }


    fun deleteById(id:Int){
        noteRepository.deleteById(id)
    }


    fun update(note: Note) {
        noteRepository.update(note)
    }


    fun getAllNotes(): LiveData<List<Note>> {
        return noteRepository.getAllNotes()
    }


}