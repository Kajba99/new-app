package com.example.mygym.entities.relation

import androidx.room.Entity


@Entity(primaryKeys = ["memberName", "typeName"])
data class MemberTypeCrossRef(
    val memberName: String,
    val typeName: String
)