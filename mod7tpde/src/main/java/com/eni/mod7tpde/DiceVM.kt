package com.eni.mod7tpde

import androidx.lifecycle.ViewModel

class DiceVM : ViewModel() {
    var valueDice = 0
    var nbSides = 6

    fun throwDice(){
        valueDice = (1..nbSides).random()
    }
    fun changeNbSides(nbSides: Int = 6){
        this.nbSides = nbSides
    }


}