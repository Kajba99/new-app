package com.example.mygym.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Gym(
    @PrimaryKey(autoGenerate = false)
    val gymName: String
)



