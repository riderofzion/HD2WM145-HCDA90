package com.eni.mod9room

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface UserDao {
    @Insert
    suspend fun insert(user : User): Long

    @Query("SELECT * FROM User")
    fun getAll() : LiveData<List<User?>>

    @Query("SELECT * FROM User WHERE id=:id")
    fun get(id:Long) : LiveData<User?>

    @Update
    fun update(user : User)

    @Delete
    fun delete(user: User)
}