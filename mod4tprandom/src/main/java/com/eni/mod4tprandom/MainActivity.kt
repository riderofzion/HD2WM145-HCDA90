package com.eni.mod4tprandom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var textViewResultat : TextView;
    lateinit var editTextMin : EditText;
    lateinit var editTextMax : EditText;
    lateinit var buttonGenerate : Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textViewResultat = findViewById(R.id.textViewResultat);
        editTextMin = findViewById(R.id.editTextMin);
        editTextMax = findViewById(R.id.editTextMax);
        buttonGenerate = findViewById(R.id.buttonGenerate);

        //Lors du clic sur le bouton Generate, je génère un nombre aléatoire entre min et max
        buttonGenerate.setOnClickListener {
            try {
                val min = Integer.parseInt(editTextMin.text.toString())
                val max = Integer.parseInt(editTextMax.text.toString())
                if(min > max)
                    textViewResultat.text = "Min doit être inférieur à max"
                else
                    textViewResultat.text = "Resultat : ${(min..max).random()}"
            }catch(nfe : java.lang.NumberFormatException){
                textViewResultat.text = "Les nombres rentrés ne sont pas des entiers !"
            }

        }

    }
}