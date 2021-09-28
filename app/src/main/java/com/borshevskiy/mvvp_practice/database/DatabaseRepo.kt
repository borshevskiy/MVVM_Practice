package com.borshevskiy.mvvp_practice.database

import androidx.lifecycle.LiveData
import com.borshevskiy.mvvp_practice.models.AppNote

interface DatabaseRepo {

    val allNotes:LiveData<List<AppNote>>

    suspend fun insert(note: AppNote, onSuccess:() -> Unit)

    suspend fun delete(note: AppNote, onSuccess:() -> Unit)

    suspend fun update(note: AppNote, onSuccess:() -> Unit)
}