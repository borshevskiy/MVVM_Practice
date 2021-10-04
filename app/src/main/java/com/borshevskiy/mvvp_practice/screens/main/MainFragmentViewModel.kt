package com.borshevskiy.mvvp_practice.screens.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.borshevskiy.mvvp_practice.database.room.AppRoomDatabase
import com.borshevskiy.mvvp_practice.database.room.AppRoomRepo
import com.borshevskiy.mvvp_practice.models.AppNote
import com.borshevskiy.mvvp_practice.utils.REPOSITORY

class MainFragmentViewModel(application: Application): AndroidViewModel(application) {

    val allNotes = REPOSITORY.allNotes

}