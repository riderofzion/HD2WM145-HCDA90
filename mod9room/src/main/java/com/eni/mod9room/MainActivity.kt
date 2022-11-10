package com.eni.mod9room

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.eni.mod9room.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var vm: UserViewModel
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        vm = ViewModelProvider(this,ViewModelFactory(application))[UserViewModel::class.java]
        binding.vm = vm
        binding.lifecycleOwner = this

        binding.buttonSaveUser.setOnClickListener {
            vm.saveUser(User(
                0L,
                binding.editTextFirstName.text.toString(),
                binding.editTextLastName.text.toString(),
                Integer.parseInt(binding.editTextBirthYear.text.toString()),
            ))
        }
        //thread {
        //    val db = AppDatabase.getInstance(this@MainActivity)
        //    db.userDao().insert(User(0L,"Jean-Michel","Velleda",1985))
        //    db.userDao().insert(User(0L,"Francis","Mug",1985))
        //}.start()



    }
}