package com.example.mygym

import androidx.room.*
import com.example.mygym.entities.Director
import com.example.mygym.entities.Gym
import com.example.mygym.entities.Member
import com.example.mygym.entities.Type
import com.example.mygym.entities.relation.*


@Dao
interface GymDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertGym(gym: Gym)


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDirector(director: Director)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMember(member: Member)


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertType(type: Type)


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMemberTypeCrossRef(crossRef: MemberTypeCrossRef)

    @Transaction
    @Query("SELECT * FROM gym WHERE gymName = :gymName")
    suspend fun getGymAndDirectorWithGymName(gymName : String) : List<GymAndDirector>

    @Transaction
    @Query("SELECT * FROM gym WHERE gymName = :gymName")
    suspend fun getGymWithMembers(gymName: String) : List<GymWithMembers>


    @Transaction
    @Query("SELECT * FROM type WHERE typeName = :typeName")
    suspend fun getMembersOfType(typeName : String) : List<TypeWithMembers>


    @Transaction
    @Query("SELECT * FROM member WHERE memberName = :memberName")
    suspend fun getTypeOfMember(memberName : String) : List<MemberWithTypes>
}