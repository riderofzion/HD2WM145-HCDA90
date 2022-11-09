package com.eni.mod9room

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ViewModelFactory(val app: Application) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(UserViewModel::class.java)){
            return AppDatabase.getInstance(app).userDao().let {
                UserViewModel(it,app)
            } as T
        }
        return super.create(modelClass)
    }
}