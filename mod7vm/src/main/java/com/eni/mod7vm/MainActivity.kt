package com.eni.mod7vm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.eni.mod7vm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var vm: CompteurVM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        vm = ViewModelProvider(this)[CompteurVM::class.java]
        binding.lifecycleOwner = this
        binding.vm = vm
        //vm.compteur.observe(this, Observer {
        //    //binding.textViewCompteur.text = it.toString()
        //    //binding.vm = vm
        //    binding.notifyChange()
        //})

        binding.floatingActionButton.setOnClickListener {
            vm.plusUn()
            //binding.vm = vm
        }
        binding.floatingActionButtonPlus2.setOnClickListener {
            vm.plusDeux()
            //binding.vm = vm
        }

    }
}