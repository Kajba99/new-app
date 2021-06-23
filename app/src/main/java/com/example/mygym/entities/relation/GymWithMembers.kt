package com.example.mygym.entities.relation

import androidx.room.Embedded
import androidx.room.Relation
import com.example.mygym.entities.Gym
import com.example.mygym.entities.Member


data class GymWithMembers(
    @Embedded val gym: Gym,
    @Relation(
        parentColumn = "gymName",
        entityColumn = "gymName"
    )
    val members: List<Member>
)
