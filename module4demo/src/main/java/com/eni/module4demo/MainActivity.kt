package com.eni.module4demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //ON va écrire du code ici :D
        val textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.buttonPlus2)
        button.setOnClickListener {
            textView.text = "J'ai appuyé sur le bouton :D"
        }

        //val toggleButton = findViewById<ToggleButton>(R.id.button)
        //toggleButton.setOnCheckedChangeListener { _, isChecked ->
        //    if(isChecked) {
        //        textView.text = "J'ai appuyé sur le bouton :D"
        //    }else
        //        textView.text = "Hello World"
        //}
    }
}