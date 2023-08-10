package com.example.roomimplementation.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.roomimplementation.dao.NoteDao
import com.example.roomimplementation.data.Note

@Database(entities = [Note::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): NoteDao
}