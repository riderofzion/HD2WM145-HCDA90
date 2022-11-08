package com.eni.mod6permissions

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //vérification permission déjà accordée
        //ContextCompat.checkSelfPermission(this,Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED
        ActivityCompat.requestPermissions(
            this,
            arrayOf(Manifest.permission.CALL_PHONE),
            12
        );

    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode == 12 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
            //La permission d'accès à l'appel téléphonique est accordée
            val intentCallENI = Intent(Intent.ACTION_CALL, Uri.parse("tel:0228031728"))
            if (intentCallENI.resolveActivity(packageManager) != null) {
                startActivity(intentCallENI)
            } else {
                Log.d("Main Activity", "No Intent available to handle action");
            }
        }
    }



}