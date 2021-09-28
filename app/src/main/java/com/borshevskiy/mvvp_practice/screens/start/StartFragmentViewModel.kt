package com.borshevskiy.mvvp_practice.screens.start

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.borshevskiy.mvvp_practice.database.room.AppRoomDatabase
import com.borshevskiy.mvvp_practice.database.room.AppRoomRepo
import com.borshevskiy.mvvp_practice.utils.REPOSITORY
import com.borshevskiy.mvvp_practice.utils.TYPE_ROOM

class StartFragmentViewModel(application: Application): AndroidViewModel(application) {
    private val mContext = application

    fun initDatabase(type: String, onSuccess:()-> Unit) {
        when(type) {
            TYPE_ROOM -> {
                val dao = AppRoomDatabase.getInstance(mContext).getAppRoomDAO()
                REPOSITORY = AppRoomRepo(dao)
                onSuccess()
            }
        }
    }
}