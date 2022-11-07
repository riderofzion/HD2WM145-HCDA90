package com.eni.mod6intentexplicite

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TargetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_target)
        val stringExtra = intent.getStringExtra("extraString")
        findViewById<TextView>(R.id.textView).text = stringExtra
    }
}