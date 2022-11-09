package com.eni.mod7tpde

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.eni.mod7tpde.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnClickListener {
    lateinit var binding: ActivityMainBinding;
    lateinit var vm: DiceVM;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        vm = ViewModelProvider(this)[DiceVM::class.java]
        binding.lifecycleOwner = this
        binding.button4.setOnClickListener(this)
        binding.button6.setOnClickListener(this)
        binding.button8.setOnClickListener(this)
        binding.button12.setOnClickListener(this)
        binding.buttonThrow.setOnClickListener(this)

        binding.vm = vm

    }

    override fun onClick(view: View?) {
        when (view?.id){
            R.id.button4 -> vm.changeNbSides(4)
            R.id.button6 -> vm.changeNbSides(6)
            R.id.button8 -> vm.changeNbSides(8)
            R.id.button12 ->  vm.changeNbSides(12)
            R.id.buttonThrow -> vm.throwDice()
        }
        //binding.vm = vm
    }
}