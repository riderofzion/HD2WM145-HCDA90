package com.eni.mod6intentexplicite

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.buttonToTarget)
        button.setOnClickListener {
            //Se déplacer vers l'activité TargetActivity
            val intentToTarget = Intent(this,TargetActivity::class.java)
            intentToTarget.putExtra(
                "extraString",
                "Hello Target,c'est moi MainActivity xoxoxo")
            startActivity(intentToTarget)
        }
    }
}