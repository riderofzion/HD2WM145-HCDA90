package com.eni.mod10recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val alRestaurant = arrayListOf(
            Restaurant(RestoType.burger,"McDonadls","Angers",2.0f),
            Restaurant(RestoType.diners,"Holly's Burger","Nantes",4.5f),
            Restaurant(RestoType.sushi,"SushiCompany","Saint-Herblain",3.8f),
            Restaurant(RestoType.italien,"PastaItaly","Paris",4.8f),
            Restaurant(RestoType.fastfood,"RapidMontp","Montpellier",2.3f),
            Restaurant(RestoType.thai,"ThaiEasy","Angers",3.8f),
            Restaurant(RestoType.ramen,"Maramen","Marseille",3.2f),
            Restaurant(RestoType.sushi,"LyonSushi","Lyon",2.6f),
            Restaurant(RestoType.burger,"BurgerKin","Toulouse",1.8f),
            Restaurant(RestoType.thai,"ThaiRennes","Rennes",4.2f),
            Restaurant(RestoType.burger,"KFC","Quimper",3.9f),
            Restaurant(RestoType.diners,"DinerAncenis","Ancenis",2.5f)
        )
        val adapter = RestaurantAdapter(alRestaurant)
        val rv = findViewById<RecyclerView>(R.id.recyclerView)
        rv.layoutManager= LinearLayoutManager(this);
        rv.adapter = adapter
    }
}