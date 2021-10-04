package com.borshevskiy.mvvp_practice.screens.addNewNote

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.borshevskiy.mvvp_practice.models.AppNote
import com.borshevskiy.mvvp_practice.utils.REPOSITORY
import kotlinx.coroutines.launch

class AddNewNoteViewModel(application: Application): AndroidViewModel(application) {

    fun insertNewNote(note: AppNote, onSuccess:() -> Unit) {
        viewModelScope.launch {
            REPOSITORY.insert(note) {
                onSuccess()
            }
        }
    }
}
