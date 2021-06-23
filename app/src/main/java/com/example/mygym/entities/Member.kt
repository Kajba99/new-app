package com.example.mygym.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Member(
    @PrimaryKey(autoGenerate = false)
    val memberName: String,
    val memberSince: Int,
    val gymName: String
)