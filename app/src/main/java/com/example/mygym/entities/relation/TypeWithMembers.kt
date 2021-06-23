package com.example.mygym.entities.relation

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.example.mygym.entities.Member
import com.example.mygym.entities.Type


data class TypeWithMembers(
    @Embedded val type: Type,
    @Relation(
        parentColumn = "typeName",
        entityColumn = "memberName",
        associateBy = Junction(MemberTypeCrossRef::class)
    )

    val members: List<Member>
)
