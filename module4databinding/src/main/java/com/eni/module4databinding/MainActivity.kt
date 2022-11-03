package com.eni.module4databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.eni.module4databinding.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var amb: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = DataBindingUtil.setContentView(this,R.layout.activity_main)
        var john = User("JohnDoe42","+33420420420",
            "USA","Newark","johndoe@420.biz")
        amb.user = john
        amb.buttonCheckData.setOnClickListener {
            Snackbar.make(
                amb.root,
                amb.user.toString(),
                Snackbar.LENGTH_SHORT).show()
        }
    }
}