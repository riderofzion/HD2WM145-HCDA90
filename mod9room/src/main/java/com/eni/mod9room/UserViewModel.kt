package com.eni.mod9room

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class UserViewModel(val userDao: UserDao, application: Application) : AndroidViewModel(application) {
    var user : User? = null
    //init {
    //    userDao
    //}

}