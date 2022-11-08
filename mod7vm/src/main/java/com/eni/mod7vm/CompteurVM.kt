package com.eni.mod7vm

import androidx.lifecycle.ViewModel

class CompteurVM : ViewModel() {
    var compteur = 0;

    fun plusUn() = ++compteur
}