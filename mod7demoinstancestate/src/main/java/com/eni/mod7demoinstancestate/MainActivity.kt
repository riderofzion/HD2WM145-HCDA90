package com.eni.mod7demoinstancestate

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.eni.mod7demoinstancestate.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.floatingActionButton.setOnClickListener { onClickCompteur() }
        binding.compteur = 0
    }
    fun onClickCompteur(){
        binding.compteur = binding.compteur+1
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("compteur",binding.compteur)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        binding.compteur = savedInstanceState.getInt("compteur")
    }
}