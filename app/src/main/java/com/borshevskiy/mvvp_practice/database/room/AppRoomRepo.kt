package com.borshevskiy.mvvp_practice.database.room

import androidx.lifecycle.LiveData
import com.borshevskiy.mvvp_practice.database.DatabaseRepo
import com.borshevskiy.mvvp_practice.models.AppNote

class AppRoomRepo(private val appRoomDAO: AppRoomDAO): DatabaseRepo {

    override val allNotes: LiveData<List<AppNote>>
        get() = appRoomDAO.getAllNotes()

    override suspend fun insert(note: AppNote, onSuccess: () -> Unit) {
        appRoomDAO.insert(note)
        onSuccess()
    }

    override suspend fun delete(note: AppNote, onSuccess: () -> Unit) {
        appRoomDAO.delete(note)
        onSuccess()
    }

    override suspend fun update(note: AppNote, onSuccess: () -> Unit) {
        appRoomDAO.update(note)
        onSuccess()
    }

}