package com.eni.mod9room

import androidx.room.*

@Dao
interface UserDao {
    @Insert
    fun insert(user : User)

    @Query("SELECT * FROM User")
    fun getAll() : List<User>

    @Update
    fun update(user : User)

    @Delete
    fun delete(user: User)
}