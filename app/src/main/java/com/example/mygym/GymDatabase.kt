package com.example.mygym

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mygym.entities.Director
import com.example.mygym.entities.Gym
import com.example.mygym.entities.Member
import com.example.mygym.entities.Type
import com.example.mygym.entities.relation.MemberTypeCrossRef

@Database(
    entities = [
        Gym::class,
        Member::class,
        Director::class,
        Type::class,
        MemberTypeCrossRef::class
    ],
    version = 1
)
abstract class GymDatabase: RoomDatabase() {

    abstract val gyymDao: GymDao

    companion object {
        @Volatile
        private var INSTANCE: GymDatabase? = null

        fun getInstance(context: Context): GymDatabase {
            synchronized(this) {
                return INSTANCE ?: Room.databaseBuilder(
                    context.applicationContext,
                    GymDatabase::class.java,
                    "gyym_db"
                ).build().also {
                    INSTANCE = it
                }
            }
        }

    }



}
