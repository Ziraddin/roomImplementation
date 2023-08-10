package com.example.roomimplementation.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.roomimplementation.data.Note

@Dao
interface NoteDao {
    @Query("SELECT * FROM note")
    fun getAll(): List<Note>

    @Insert
    fun insert(note: Note)
}