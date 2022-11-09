package com.eni.mod9room

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val vm = ViewModelProvider(this,ViewModelFactory(application))[UserViewModel::class.java]
        //thread {
        //    val db = AppDatabase.getInstance(this@MainActivity)
        //    db.userDao().insert(User(0L,"Jean-Michel","Velleda",1985))
        //    db.userDao().insert(User(0L,"Francis","Mug",1985))
        //}.start()



    }
}