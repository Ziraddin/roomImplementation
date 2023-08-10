package com.example.roomimplementation.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity()
data class Note(
    @PrimaryKey(autoGenerate = true) val uId: Int,
    @ColumnInfo(name = "noteTitle") val noteTitle: String?,
    @ColumnInfo(name = "noteContent") val noteContent: String?
)