package com.eni.mod7tpde

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DiceVM : ViewModel() {
    val valueDice = MutableLiveData(0)
    val nbSides = MutableLiveData(6)

    fun throwDice(){
        nbSides.value?.let {
            valueDice.value = (1..it).random()
        }
        //if(nbSides.value != null){
        //    valueDice.value = (1..nbSides.value!!).random()
        //}

    }
    fun changeNbSides(nbSides: Int = 6){
        this.nbSides.value = nbSides
    }


}