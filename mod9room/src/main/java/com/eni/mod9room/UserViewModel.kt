package com.eni.mod9room

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class UserViewModel(val userDao: UserDao, application: Application) : AndroidViewModel(application) {
    var user : LiveData<User?> = MutableLiveData<User>(null)
    init {
        user = userDao.get(1L)
    }
    fun saveUser(user:User){
        viewModelScope.launch {
            userDao.insert(user).also {
                this@UserViewModel.user = userDao.get(it)
            }

        }

    }

}