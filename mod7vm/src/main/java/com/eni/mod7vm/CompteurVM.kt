package com.eni.mod7vm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

//class CompteurVM : ViewModel() {
//    var compteur = 0;
//
//    fun plusUn() = ++compteur
//}

class CompteurVM : ViewModel() {
    val compteur = MutableLiveData(0);

    fun plusUn() {
        compteur.value = compteur.value?.inc()
    }
    fun plusDeux() {
        compteur.value= compteur.value?.plus(2)
    }
}