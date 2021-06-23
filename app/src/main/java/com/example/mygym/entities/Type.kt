package com.example.mygym.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Type(
    @PrimaryKey(autoGenerate = false)
    val typeName: String

)