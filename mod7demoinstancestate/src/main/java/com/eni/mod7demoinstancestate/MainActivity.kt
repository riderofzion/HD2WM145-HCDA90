package com.eni.mod7demoinstancestate

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    lateinit var textViewCompteur : TextView;
    lateinit var floatingActionButton: FloatingActionButton;
    var compteur = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //J'affecte mes différentes vues
        textViewCompteur = findViewById(R.id.textViewCompteur)
        floatingActionButton = findViewById(R.id.floatingActionButton)

        floatingActionButton.setOnClickListener { onClickCompteur() }
        //J'affiche mon compteur dans le textView
        textViewCompteur.text = compteur.toString();

    }
    fun onClickCompteur(){
        compteur ++;
        //J'affiche mon compteur dans le textView
        textViewCompteur.text = compteur.toString();
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("compteur",compteur)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        compteur = savedInstanceState.getInt("compteur")
        textViewCompteur.text = compteur.toString();

    }
}