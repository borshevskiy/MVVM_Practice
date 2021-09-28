package com.borshevskiy.mvvp_practice.database.room

import androidx.lifecycle.LiveData
import androidx.room.*
import com.borshevskiy.mvvp_practice.models.AppNote

@Dao
interface AppRoomDAO {

    @Query("SELECT * FROM notes_table")
    fun getAllNotes(): LiveData<List<AppNote>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(note:AppNote)

    @Delete
    suspend fun delete(note:AppNote)

    @Update
    suspend fun update(note: AppNote)
}