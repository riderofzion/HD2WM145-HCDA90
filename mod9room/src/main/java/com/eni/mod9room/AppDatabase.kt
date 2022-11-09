package com.eni.mod9room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(User::class),version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    //Accès aux Dao (doivent absolument être annotés @Dao)
    abstract fun userDao(): UserDao

    companion object{
        @Volatile
        private var INSTANCE : AppDatabase? = null
        fun getInstance(context: Context) : AppDatabase{
            synchronized(this){
                var instance = INSTANCE
                if (instance==null){
                    instance = Room.databaseBuilder(
                        context,
                        AppDatabase::class.java,
                        "user"
                    ).fallbackToDestructiveMigration()
                        .build()
                }
                return instance
            }

        }
    }

}