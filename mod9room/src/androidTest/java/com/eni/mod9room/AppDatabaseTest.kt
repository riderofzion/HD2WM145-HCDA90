package com.eni.mod9room

import androidx.room.Room
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import junit.framework.Assert.assertTrue
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class AppDatabaseTest {
    private lateinit var userDao: UserDao
    private lateinit var db: AppDatabase
    @Before
    @Throws(Exception::class)
    fun creerBdd(){
        val context = InstrumentationRegistry.getInstrumentation().targetContext
        db = Room.inMemoryDatabaseBuilder(context, AppDatabase::class.java).allowMainThreadQueries().build()
        userDao = db.userDao()
    }
    @After     fun deconnexionBdd(){
        db.close()
    }
    @Test
    fun insertions(){
        userDao.insert(User(0, "Terieur", "Alex",1955))
        userDao.insert(User(0, "Centrique", "Alex",1652))
        val personne = userDao.getAll()
        assertTrue(personne[0].id == 1L)
    }
}
