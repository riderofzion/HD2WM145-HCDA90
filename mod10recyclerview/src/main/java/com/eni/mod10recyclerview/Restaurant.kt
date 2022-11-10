package com.eni.mod10recyclerview

data class Restaurant(val type : RestoType,
                      val nom : String,
                      val ville : String,
                      val ratingStars : Float)

enum class RestoType{
    pizzeria,sushi,fastfood,ramen,thai,italien,
    diners, burger,indien
}