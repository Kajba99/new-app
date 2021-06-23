package com.example.mygym.entities.relation

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.example.mygym.entities.Member
import com.example.mygym.entities.Type


data class MemberWithTypes(
    @Embedded val member: Member,
    @Relation (
        parentColumn = "memberName",
        entityColumn = "typeName",
        associateBy = Junction(MemberTypeCrossRef::class)
            )

    val types: List<Type>
)
