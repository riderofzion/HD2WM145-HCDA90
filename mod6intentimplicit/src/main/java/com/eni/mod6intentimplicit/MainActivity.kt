package com.eni.mod6intentimplicit

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent = Intent(
            Intent.ACTION_VIEW,
            Uri.parse("geo:47.4704,-0.5512")
        )
        startActivity(intent)
    }
}