package com.eni.mod5nav

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(var age: Int, var prenom: String) : Parcelable
