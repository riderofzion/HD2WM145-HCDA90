package com.eni.mod5racontemoiunehistoire

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Story(
    var prenom: String = "Simon",
    var lieu: String = "Chateau"): Parcelable