package com.eni.mod9room

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        thread {
            val db = AppDatabase.getInstance(this@MainActivity)
            db.userDao().insert(User(0L,"Jean-Michel","Velleda",1985))
            db.userDao().insert(User(0L,"Francis","Mug",1985))
        }.start()



    }
}