package com.example.mygym.entities.relation

import androidx.room.Embedded
import androidx.room.Relation
import com.example.mygym.entities.Director
import com.example.mygym.entities.Gym


data class GymAndDirector(
    @Embedded val gym: Gym,
    @Relation(
       parentColumn = "gymName",
       entityColumn = "gymName"
   )
   val director: Director
)